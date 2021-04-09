package com.chenly.springcloud.domain;

import lombok.Data;

/**
 * @Author Song
 * @Date 2021/4/9 15:52
 * @Version 1.0
 * @Description
 */
@Data
public class Storage {
    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
