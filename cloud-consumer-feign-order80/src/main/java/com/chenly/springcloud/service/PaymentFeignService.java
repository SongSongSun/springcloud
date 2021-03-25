package com.chenly.springcloud.service;

import com.chenly.springcloud.entities.CommonResult;
import com.chenly.springcloud.entities.Payment;
import com.chenly.springcloud.entities.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author Song
 * @Date 2021/3/24 9:47
 * @Version 1.0
 * @Description
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPayment(@PathVariable("id") long id);

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();

    @PostMapping(value = "/payment/feign/post")
    String paymentPostFeign(@RequestBody Person person);
}
