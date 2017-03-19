package _2mapperProxy;

/**
 * Created by acey on 17-3-19.
 */
public interface StudentMapper {

    void insertStu(Student student);

    Student findById(int id);

    void updateStu(Student student);

    void deleteById(int id);
}
