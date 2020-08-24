package com.datage.springcloud.service.impl;

import com.datage.springcloud.dao.PaymentDao;
import com.datage.springcloud.entities.Payment;
import com.datage.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther Mike
 * @create 2020/8/24
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
