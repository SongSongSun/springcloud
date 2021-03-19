package com.chenly.springcloud.dao;

import com.chenly.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author : chenlinyan
 * @version : 1.0
 * @date : 2021/3/18 13:57
 */
@Mapper
//@Repository  -- 某些情况插入的时候可能会有问题，建议用Mapper
public interface PaymentDao {


        int create(Payment payment);

        Payment getPayment(@Param("id") long id);


}
