package com.datage.springcloud.service;

import com.datage.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther Mike
 * @create 2020/8/24
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
