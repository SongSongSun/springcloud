package com.chenly.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Song
 * @Date 2021/3/22 15:29
 * @Version 1.0
 * @Description 更换ribbon默认的负载均衡算法配置, 需要不在@ComponentScan所扫描的包及子包下面
 */
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
