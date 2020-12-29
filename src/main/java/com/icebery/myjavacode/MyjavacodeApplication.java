package com.icebery.myjavacode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.icebery.myjavacode.mapper")
@SpringBootApplication
public class MyjavacodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyjavacodeApplication.class, args);
    }

}

