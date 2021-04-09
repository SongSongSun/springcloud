package com.chenly.springcloud.controller;

import com.chenly.springcloud.domain.CommonResult;
import com.chenly.springcloud.domain.Order;
import com.chenly.springcloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Song
 * @Date 2021/4/9 15:24
 * @Version 1.0
 * @Description
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功!");
    }
}
