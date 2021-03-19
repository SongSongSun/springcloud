package com.chenly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author : chenlinyan
 * @version : 1.0
 * @date : 2021/3/18 15:05
 */
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@SpringBootApplication
public class OrderMain80 {


    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
