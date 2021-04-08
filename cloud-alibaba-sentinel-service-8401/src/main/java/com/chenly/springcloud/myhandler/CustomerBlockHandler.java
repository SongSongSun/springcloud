package com.chenly.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.chenly.springcloud.entities.CommonResult;

/**
 * @Author Song
 * @Date 2021/4/8 16:26
 * @Version 1.0
 * @Description
 */
public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler");
    }
}
