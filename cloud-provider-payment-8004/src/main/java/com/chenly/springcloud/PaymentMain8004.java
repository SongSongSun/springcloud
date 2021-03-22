package com.chenly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author Song
 * @Date 2021/3/22 10:05
 * @Version 1.0
 * @Description @EnableDiscoveryClient该注解适用于 consul及zookeeper作为服务注册中心
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
