package com.chenly.springcloud.controller;

import com.chenly.springcloud.entities.CommonResult;
import com.chenly.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author : chenlinyan
 * @version : 1.0
 * @date : 2021/3/18 15:27
 */
@RestController
@Slf4j
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    public static final String PAYMENT_URL="http://localhost:8001";

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        log.info("payment:{}",payment);
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }



    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }

}
