package com.zd.springCloud.service.impl;

import com.zd.springCloud.dao.PaymentDao;
import com.zd.springCloud.entities.Payment;
import com.zd.springCloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: zd
 * @time: 2020/10/21 22:23
 */
@Service
public class PaymentServiceImpl implements PaymentService {

//    @Autowired
//    private PaymentDao paymentDao ;

    @Override
    public int create(Payment payment) {
//        return paymentDao.create(payment);
        return 0;
    }

    @Override
    public Payment getPaymentById(long id) {
//        return paymentDao.getPaymentById(id);
        return null;
    }
}
