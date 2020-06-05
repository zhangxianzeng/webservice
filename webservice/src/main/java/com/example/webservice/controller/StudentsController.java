package com.example.webservice.controller;

import com.example.webservice.pojo.StudentEntity;
import com.example.webservice.service.StudentService;
import com.example.webservice.service.StudentService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/s")
public class StudentsController {
    @Autowired
    private StudentService1 studentService1;
    @RequestMapping("/b")
    public List<StudentEntity> findall(){
        return studentService1.getAll1();
    }
}
