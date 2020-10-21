package com.zd.springCloud.dao;

import com.zd.springCloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: zd
 * @time: 2020/10/14 22:15
 */
public interface PaymentDao {

    public int create(Payment payment);

    public  Payment getPaymentById(@Param("id") long id);
}
