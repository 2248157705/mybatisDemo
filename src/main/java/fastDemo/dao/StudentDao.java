package fastDemo.dao;

import fastDemo.entity.Student;
import fastDemo.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by acey on 17-3-5.
 */
public class StudentDao {
    /**
     * 增加学生（无参）
     */
    public void add1() throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try{
            sqlSession.insert("mynamespace.add1");
        }catch(Exception e){
            e.printStackTrace();
            sqlSession.rollback();
            throw e;
        }finally{
            sqlSession.commit();
        }
        MyBatisUtil.closeSqlSession();
    }
    /**
     * 增加学生（有参）
     */
    public void add2(Student student) throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try{
            sqlSession.insert("mynamespace.add2",student);
        }catch(Exception e){
            e.printStackTrace();
            sqlSession.rollback();
            throw e;
        }finally{
            sqlSession.commit();
        }
        MyBatisUtil.closeSqlSession();
    }
    public static void main(String[] args) throws Exception{
        StudentDao dao = new StudentDao();
        dao.add1();
        dao.add2(new Student(2,"呵呵",8000D));
    }
}
