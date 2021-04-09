package com.chenly.springcloud.service;

import com.chenly.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author Song
 * @Date 2021/4/9 15:10
 * @Version 1.0
 * @Description
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {
    /**
     * 扣减账户金额
     */
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
