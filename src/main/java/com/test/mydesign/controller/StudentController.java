package com.test.mydesign.controller;

import com.test.mydesign.pojo.Student;
import com.test.mydesign.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/boot/student/{id}")
    @ResponseBody
    public Object student(@PathVariable("id") Integer id){
        return studentService.findStudentById(id);
    }

    @RequestMapping(value = "/boot/LoginController",method = RequestMethod.GET)
//    @ResponseBody
    public String login(@RequestParam String username,@RequestParam String password){
        System.out.println(username+password+"5555555");
        Student student = studentService.findStudentByAccount(username);
        System.out.println(student);
        if(student.getAccount().equals(username)&&student.getPassword().equals(password)){
            return "SuccessfullyLogin.html";
        }
        else {
            return "SuccessfullyLogin.html";
        }
    }
}
