package com.chenly.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : chenlinyan
 * @version : 1.0
 * @date : 2021/3/18 13:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;

    private String message;

    private T data;


    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
