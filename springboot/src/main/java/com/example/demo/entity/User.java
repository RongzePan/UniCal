package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("user")
public class User {
    private int id;
    private String username;
    private String password;
    private String nickName; // 遵循驼峰命名规则
    private int age;

    // 手动添加getter和setter方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
