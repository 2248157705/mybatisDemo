package _7oneToManyMapper;

import _7oneToManyMapper.mapper.OrderMapper;
import _7oneToManyMapper.po.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by acey on 17-3-19.
 */
public class TestStudent {
    private SqlSessionFactory sqlSessionFactory;

    //在执行测试用例前执行
    @Before
    public void setUp() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFindOrdersUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> ordersUser = mapper.findOrdersUser();
        System.out.println(ordersUser.get(0).getProducts());
    }

}
