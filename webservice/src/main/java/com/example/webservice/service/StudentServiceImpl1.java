package com.example.webservice.service;

import com.example.webservice.dao.Students;
import com.example.webservice.pojo.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xzy
 * @date 2020-03-15 20:01
 * 说明：对外提供的学生信息服务
 */
@WebService(serviceName = "StudentService1",
        targetNamespace = "http://service.webservice.example.com",
        endpointInterface = "com.example.webservice.service.StudentService1")
@Service
public class StudentServiceImpl1 implements StudentService1 {
    @Autowired
    private Students students;
    /**
     * 获取所有学生信息
     *
     * @return - 所有学生信息
     */
    @Override
    public List<StudentEntity> getAll1() {
        System.out.println("getAll1():监听到请求");

        return students.getAll1();
    }
}