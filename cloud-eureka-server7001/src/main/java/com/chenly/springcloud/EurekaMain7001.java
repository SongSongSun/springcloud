package com.chenly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author : chenlinyan
 * @version : 1.0
 * @date : 2021/3/18 17:33
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {


    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
