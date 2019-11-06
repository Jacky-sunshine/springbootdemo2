package com.gxh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.gxh.mapper")
public class DemoApplication {
    public static void main (String[] args){
        SpringApplication.run(DemoApplication.class,args);
    }
}
