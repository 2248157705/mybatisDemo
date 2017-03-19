package _2mapperProxy;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

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
    public void testInsert() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper student = sqlSession.getMapper(StudentMapper.class);
        Student stu = new Student();
        stu.setName("哈哈");
        stu.setSal(70.0);
        student.insertStu(stu);

        sqlSession.commit();

    }

    @Test
    public void testDeleteById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper student = sqlSession.getMapper(StudentMapper.class);
        student.deleteById(2);

    }
}
