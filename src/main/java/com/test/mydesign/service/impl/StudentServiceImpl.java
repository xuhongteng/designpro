package com.test.mydesign.service.impl;

import com.test.mydesign.mapper.StudentMapper;
import com.test.mydesign.pojo.Student;
import com.test.mydesign.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    /**注入一个springboot自动配置好的RedisTemplate对象来对redis进行操作**/
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int insertStudent(Student student) {
        return 0;
    }

    @Override
    public int deleteStudentById(Integer id) {
        return 0;
    }

    @Override
    public Student findStudentById(Integer id) {
        return studentMapper.findStudentById(id);
    }

    @Override
    public Student findStudentByAccount(String account) {
        return studentMapper.findStudentByAccount(account);
    }

    @Override
    public List<Student> getStudents() {
        return null;
    }

    @Override
    public Boolean updateStudent(Student student) {
        return null;
    }
}
