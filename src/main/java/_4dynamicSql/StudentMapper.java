package _4dynamicSql;

import java.util.List;

/**
 * Created by acey on 17-3-19.
 */
public interface StudentMapper {

    List<Student> findStudents(StudentVo studentVo);
}
