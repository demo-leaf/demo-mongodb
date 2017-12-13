package com.leaf.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class DemoMongoDBApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoMongoDBApplication.class, args);
    }
}
