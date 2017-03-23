package _5oneToOneMapperReturnType;

import _4dynamicSql.StudentCustom;
import _4dynamicSql.StudentMapper;
import _4dynamicSql.StudentVo;
import _5oneToOneMapperReturnType.mapper.OrderCustomMapper;
import _5oneToOneMapperReturnType.po.OrderCustom;
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
        OrderCustomMapper mapper = sqlSession.getMapper(OrderCustomMapper.class);
        List<OrderCustom> ordersUser = mapper.findOrdersUser();
        System.out.println(ordersUser.size());
    }

}
