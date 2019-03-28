package com.test.mydesign.service;

import com.test.mydesign.pojo.Student;

import java.util.List;

public interface StudentService {

    /**
     * 学生添加
     * @param student
     * @return
     */
    int insertStudent(Student student);

    /**
     * 通过学生id值删除学生
     * @param id
     * @return
     */
    int deleteStudentById(Integer id);

    /**
     * 通过id查找学生
     * @param id
     * @return
     */
    Student findStudentById(Integer id);

    /**
     * 通过登录账户查找学生
     * @param account
     * @return
     */
    Student findStudentByAccount(String account);

    /**
     * 查找所有学生
     * @return
     */
    List<Student> getStudents();

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    Boolean updateStudent(Student student);



}
