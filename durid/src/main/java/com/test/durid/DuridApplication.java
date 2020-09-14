package com.test.durid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.test.durid.mapper")
public class DuridApplication {

    public static void main(String[] args) {
        SpringApplication.run(DuridApplication.class, args);
    }

}
