package com.chenly.springcloud.service;

import com.chenly.springcloud.entities.CommonResult;
import com.chenly.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
}
