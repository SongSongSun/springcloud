package com.chenly.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Song
 * @Date 2021/4/9 15:28
 * @Version 1.0
 * @Description
 */
@Configuration
@MapperScan({"com.chenly.springcloud.dao"})
public class MybatisConfig {
}
