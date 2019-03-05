package com.jiayisheng.jiaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JiaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiaserverApplication.class, args);
    }

}
