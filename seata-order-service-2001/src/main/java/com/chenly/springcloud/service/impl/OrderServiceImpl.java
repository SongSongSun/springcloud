package com.chenly.springcloud.service.impl;

import com.chenly.springcloud.dao.OrderDao;
import com.chenly.springcloud.domain.Order;
import com.chenly.springcloud.service.AccountService;
import com.chenly.springcloud.service.OrderService;
import com.chenly.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author Song
 * @Date 2021/4/9 14:59
 * @Version 1.0
 * @Description
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Resource
    private AccountService accountService;
    @Resource
    private StorageService storageService;

    /**
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     * 简单说：
     * 下订单->减库存->减余额->改状态
     */
    @Override
    @GlobalTransactional(rollbackFor = Exception.class,name = "song-create-order")
    public void create(Order order) {
        log.info("------>开始新建订单");
        orderDao.create(order);
        log.info("------>订单微服务开始调用库存，做减扣Count");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("------>订单微服务开始调用库存，做减扣end");
        log.info("------>订单微服务开始调用账户，做减扣Money");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("------>订单微服务开始调用账户，做减扣end");

        log.info("------>修改订单状态");
        orderDao.update(order.getUserId(),0);
        log.info("------>修改订单状态end");
        log.info("------>下订单结束");
    }
}
