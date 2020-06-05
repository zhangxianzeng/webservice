package com.example.webservice.pojo;

import lombok.Data;

/**
 * @author xzy
 * @date 2020-03-15 18:25
 * 说明：user表对应的实体类
 */
@Data
public class UserEntity {
    private String name;
    private String sex;

    public UserEntity(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public UserEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}