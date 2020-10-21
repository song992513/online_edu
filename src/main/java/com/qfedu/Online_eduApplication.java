package com.qfedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.qfedu.dao")//扫描持久层

public class Online_eduApplication {

    public static void main(String[] args) {
        SpringApplication.run(Online_eduApplication.class, args);
    }

}
