package com.chenly.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : chenlinyan
 * @version : 1.0
 * @date : 2021/3/18 15:33
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * 使用@LoadBalanced注解提供RestTemplate负载均衡的能力
     */
    @Bean
    //@LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


}
