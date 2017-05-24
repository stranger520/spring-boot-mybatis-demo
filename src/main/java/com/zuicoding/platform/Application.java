package com.zuicoding.platform;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.zuicoding.platform.demo.dao")
public class Application {
    private static Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main( String[] args ){

        logger.info( "Hello World!" );

        SpringApplication.run(Application.class,args);
    }
}
