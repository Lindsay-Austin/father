package com.entity;

import org.springframework.stereotype.Repository;

@Repository
public class User {
    String name;

    String age;

    String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String showEntity(){
        return "我是Entity！";
    }
}
