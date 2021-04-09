package com.chenly.springcloud.service;

import java.math.BigDecimal;

/**
 * @Author Song
 * @Date 2021/4/9 16:26
 * @Version 1.0
 * @Description
 */
public interface AccountService {
    /**
     * 扣减账户余额
     *
     * @param userId 用户id
     * @param money  金额
     */
    void decrease(Long userId, BigDecimal money);
}
