package com.test.mydesign.mapper;

import com.test.mydesign.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    /**
     * 添加学生
     * @param record
     * @return
     */
    int insert(Student record);

    int insertSelective(Student record);

    Student findStudentById(Integer id);

    Student findStudentByAccount(String account);

    List<Student> getStudents();

    Boolean updateStudent(Student student);
}