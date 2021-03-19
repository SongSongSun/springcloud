package com.chenly.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : chenlinyan
 * @version : 1.0
 * @date : 2021/3/18 13:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private Long id;
    private String serial;

}
