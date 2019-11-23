package com.fowl;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.Date;

/**
 * 数据源加载
 */
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
@Logger
public class FowlServiceImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(FowlServiceImplApplication.class, args);
        ConfigurableApplicationContext ctx = SpringApplication.run(FowlServiceImplApplication.class, args);
        Environment environment = ctx.getEnvironment();
        String[] activeProfiles = environment.getActiveProfiles();
        for (String profile : activeProfiles) {
//            log.info("------------ Spring Boot 使用profile为:{}------------ ", profile);
        }
//        log.info("server.port:{}", environment.getProperty("server.port"));
//        log.info("spring.cloud.consul.host:{}", environment.getProperty("server.port"));
    }

}
