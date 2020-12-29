package com.icebery.myjavacode.entity;

import com.icebery.myjavacode.mapper.BookMapper;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author: 低调的小码农
 * @Date: 2020/12/28 8:17 PM
 * @Version 1.0
 */


public class Book{

    private Integer id;
    private String name;
    private String anthor;

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

    public String getAnthor() {
        return anthor;
    }

    public void setAnthor(String anthor) {
        this.anthor = anthor;
    }

}
