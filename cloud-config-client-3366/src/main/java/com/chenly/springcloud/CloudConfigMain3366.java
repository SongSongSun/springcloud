package com.chenly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Song
 * @Date 2021/3/31 15:29
 * @Version 1.0
 * @Description
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudConfigMain3366 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigMain3366.class, args);
    }
}
