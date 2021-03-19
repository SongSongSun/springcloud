package com.chenly.springcloud.service;

import com.chenly.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @author : chenlinyan
 * @version : 1.0
 * @date : 2021/3/18 14:09
 */
@Service
public interface PaymentService {


    int create(Payment payment);

    Payment getPayment(@Param("id") Long id);
}
