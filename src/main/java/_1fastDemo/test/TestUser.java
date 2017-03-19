package _1fastDemo.test;

import _1fastDemo.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


/**
 * Created by acey on 17-3-19.
 */
public class TestUser {

    /**
     * 插入 student （无参）
     */
    @Test
    public void test() {
        SqlSession sqlSession = null;
        try {
            //得到配置文件流
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            //创建会话工厂
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //从工厂中获取 sqlSession
            sqlSession = sqlSessionFactory.openSession();

            //插入数据
            sqlSession.insert("mynamespace.add1");

        } catch (Exception e) {
            //回滚
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            //提交
            sqlSession.commit();
            //关闭
            sqlSession.close();
        }
    }

    /**
     * 插入 Student （带参数）
     */
    @Test
    public void test1() {
        SqlSession sqlSession = null;
        try {
            //得到配置文件流
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            //创建会话工厂
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //从工厂中获取 sqlSession
            sqlSession = sqlSessionFactory.openSession();

            //插入数据
            sqlSession.insert("mynamespace.add2",new Student(2,"哈哈",7000.0));

        } catch (Exception e) {
            //回滚
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            //提交
            sqlSession.commit();
            //关闭
            sqlSession.close();
        }
    }
}
