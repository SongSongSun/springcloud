package com.chenly.springcloud.service;

import com.chenly.springcloud.entities.CommonResult;
import com.chenly.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author Song
 * @Date 2021/4/8 17:38
 * @Version 1.0
 * @Description
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> payment(Long id) {
        return new CommonResult<>(4444, "没有该流水号", new Payment(4444L, "errorSerial"));
    }
}
