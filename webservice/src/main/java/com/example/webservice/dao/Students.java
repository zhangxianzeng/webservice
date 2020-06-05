package com.example.webservice.dao;

import com.example.webservice.pojo.StudentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface Students {
    public List<StudentEntity> getAll1();
}
