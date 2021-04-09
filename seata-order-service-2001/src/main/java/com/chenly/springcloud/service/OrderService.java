package com.chenly.springcloud.service;

import com.chenly.springcloud.domain.Order;

/**
 * @Author Song
 * @Date 2021/4/9 14:59
 * @Version 1.0
 * @Description
 */
public interface OrderService {
    /**
     * 创建订单
     */
    void create(Order order);
}
