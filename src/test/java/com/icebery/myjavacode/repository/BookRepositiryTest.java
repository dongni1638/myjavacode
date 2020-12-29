package com.icebery.myjavacode.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: 低调的小码农
 * @Date: 2020/12/28 8:27 PM
 * @Version 1.0
 */
@SpringBootTest
class BookRepositiryTest {

    @Autowired
    private BookRepositiry bookRepositiry;


    @Test
    void findall(){

            System.out.println(bookRepositiry.findAll());
        }


}