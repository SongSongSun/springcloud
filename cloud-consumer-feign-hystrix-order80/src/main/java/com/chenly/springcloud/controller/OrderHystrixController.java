package com.chenly.springcloud.controller;

import com.chenly.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author Song
 * @Date 2021/3/24 14:58
 * @Version 1.0
 * @Description
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "paymentInfoGlobalExceptionHandler")
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    @HystrixCommand
    String paymentInfo_OK(@PathVariable("id") Integer id) {
        return paymentHystrixService.paymentInfo_OK(id);
    }

    //    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
//    })
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    @HystrixCommand
    public String paymentInfo_Timeout(@PathVariable("id") Integer id) {
        int a = 10 / 0;
        return paymentHystrixService.paymentInfo_Timeout(id);
    }

    public String paymentInfo_TimeoutHandler() {
        return "我是80消费者,对方支付系统繁忙或者检查自己(╥╯^╰╥)";
    }

    public String paymentInfoGlobalExceptionHandler() {
        return "我是80全局异常处理(╥╯^╰╥)";
    }
}
