package com.chenly.springcloud.service;

/**
 * @Author Song
 * @Date 2021/4/9 15:53
 * @Version 1.0
 * @Description
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
