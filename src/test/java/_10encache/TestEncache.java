package _10encache;

import _10encache.mapper.UserMapper;
import _10encache.po.User;
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
public class TestEncache {
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
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserById(1);
        System.out.println(user.getName());
        sqlSession.commit();
        sqlSession.close();

        sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper1 = sqlSession.getMapper(UserMapper.class);
        User user1 = mapper1.findUserById(1);
        System.out.println(user1.getName());

    }

}
