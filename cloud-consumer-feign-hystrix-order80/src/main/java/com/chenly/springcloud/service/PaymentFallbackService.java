package com.chenly.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author Song
 * @Date 2021/3/25 10:36
 * @Version 1.0
 * @Description
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService -------- paymentInfo_OK 异常";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "PaymentFallbackService----------paymentInfo_Timeout 异常";
    }
}
