package com.chenly.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

/**
 * @Author Song
 * @Date 2021/3/24 11:05
 * @Version 1.0
 * @Description
 */
@Service
public class PaymentService {
    public String paymentInfo_OK(Integer id) {
        return "线程池:\t" + Thread.currentThread().getName() + "  paymentInfo_OK,id:   " + id + "\t" + "哈哈哈哈哈";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
    })
    public String paymentInfo_Timeout(Integer id) {
        //int time = 5;
        int a = 10/0;
        /*try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "线程池:\t" + Thread.currentThread().getName() + "  paymentInfo_Timeout,id:   " + id + "\t" + "哈哈哈哈哈  耗时"  + "秒钟";
    }

    public String paymentInfo_TimeoutHandler(Integer id) {
        return "我是8001 我出错了(╥╯^╰╥)";
    }
}
