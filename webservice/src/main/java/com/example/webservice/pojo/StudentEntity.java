package com.example.webservice.pojo;

import lombok.Data;

/**
 * @author xzy
 * @date 2020-03-15 18:24
 * 说明：学生表对应的实体类
 */
@Data
public class StudentEntity {
    private String name;
    private Integer age;

    public StudentEntity(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public StudentEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}