package com.icebery.myjavacode.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author: 低调的小码农
 * @Date: 2020/12/28 8:17 PM
 * @Version 1.0
 */

@Entity
@Data
public class Book {
    @Id
    private Integer id;
    private String name;
    private String anthor;
}
