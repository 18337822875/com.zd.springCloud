package com.zd.springCloud.service;

import com.zd.springCloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

public interface PaymentService {
    public int create(Payment payment);

    public  Payment getPaymentById(@Param("id") long id);
}
