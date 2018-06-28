package com.text.demo.dao.entity;

import org.springframework.stereotype.Repository;

import java.sql.Date;


@Repository
public class BbaEntity {

    private Integer id;
    private String name;
    private Date Time;
    private String age;
    private String ban;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    public Date getTime() {
        return Time;
    }

    public void setTime(Date time) {
        Time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
