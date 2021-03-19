package com.chenly.springcloud.service.impl;

import com.chenly.springcloud.dao.PaymentDao;
import com.chenly.springcloud.entities.Payment;
import com.chenly.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : chenlinyan
 * @version : 1.0
 * @date : 2021/3/18 14:09
 */
@Service
public class PaymentServiceImpl implements PaymentService{

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPayment(Long id) {
        return paymentDao.getPayment(id);
    }
}
