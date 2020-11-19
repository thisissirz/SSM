package com.whgc.springbootssm1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.whgc.springbootssm1.dao.mapper")
@SpringBootApplication
public class Springbootssm1Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Springbootssm1Application.class, args);
    }

/*
    tomcat package need
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Springbootssm1Application.class);
    }
*/
}
