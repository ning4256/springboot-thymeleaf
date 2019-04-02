package com.ning4256.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.ning4256.springboot.dao"})
public class SpringbootFenyeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFenyeApplication.class, args);
    }

}
