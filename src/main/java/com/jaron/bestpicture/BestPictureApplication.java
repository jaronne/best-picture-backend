package com.jaron.bestpicture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.jaron.bestpicture.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class BestPictureApplication {

    public static void main(String[] args) {
        SpringApplication.run(BestPictureApplication.class, args);
    }

}
