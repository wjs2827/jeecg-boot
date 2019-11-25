package com.fowl.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value={"classpath:config/${spring.profiles.active}/application.yml"},ignoreResourceNotFound=true,encoding="utf-8")
public class AdminApplication {

    public static void main(String[] args) {

        SpringApplication.run(AdminApplication.class, args);
    }

}
