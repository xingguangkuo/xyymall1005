package com.xgk.ymall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.xgk.ymall.user.mapper")
public class YmallUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YmallUserServiceApplication.class, args);
    }

}
