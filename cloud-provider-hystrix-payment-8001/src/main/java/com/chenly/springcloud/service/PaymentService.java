package com.chenly.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author Song
 * @Date 2021/3/24 11:05
 * @Version 1.0
 * @Description
 */
@Service
public class PaymentService {
    public String paymentInfo_OK(Integer id) {
        return "线程池:\t" + Thread.currentThread().getName() + "  paymentInfo_OK,id:   " + id + "\t" + "哈哈哈哈哈";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
    })
    public String paymentInfo_Timeout(Integer id) {
        int time = 5;
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池:\t" + Thread.currentThread().getName() + "  paymentInfo_Timeout,id:   " + id + "\t" + "哈哈哈哈哈  耗时" + "秒钟";
    }

    public String paymentInfo_TimeoutHandler(Integer id) {
        return "我是8001 我出错了(╥╯^╰╥)";
    }

    /**
     * 服务熔断的演示
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentCircuitBreakerFallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间窗口
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")//失败率达到多少,发生断路
    })
    public String paymentCircuitBreaker(Integer id) {
        if (id < 0) {
            throw new RuntimeException("id不能为负数");
        }
        String uuid = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "\t" + "调用成功,流水号为:" + uuid;
    }

    public String paymentCircuitBreakerFallback(Integer id) {
        return "id不能为负数,请稍候再试,id:" + id;
    }

}
