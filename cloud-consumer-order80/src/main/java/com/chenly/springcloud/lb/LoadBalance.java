package com.chenly.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author Song
 * @Date 2021/3/23 9:09
 * @Version 1.0
 * @Description
 */
public interface LoadBalance {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
