package com.chenly.springcloud.controller;

import com.chenly.springcloud.entities.CommonResult;
import com.chenly.springcloud.entities.Payment;
import com.chenly.springcloud.entities.Person;
import com.chenly.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author Song
 * @Date 2021/3/24 9:49
 * @Version 1.0
 * @Description
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") long id) {
        return paymentFeignService.getPayment(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {

        return paymentFeignService.paymentFeignTimeout();
    }

    @PostMapping(value = "/consumer/payment/feign/post")
    public String paymentFeignPost(@RequestBody Person person) {
        return paymentFeignService.paymentPostFeign(person);
    }
}

