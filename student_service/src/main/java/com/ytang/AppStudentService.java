package com.ytang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan("com.ytang.entity")
@EnableEurekaClient
public class AppStudentService {
    public static void main(String [] args){
        SpringApplication.run(AppStudentService.class,args);
    }
}
