package com.datage.springcloud.controller;

import com.datage.springcloud.entities.CommonResult;
import com.datage.springcloud.entities.Payment;
import com.datage.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @auther Mike
 * @create 2020/8/24
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("******插入结果:"+result);

        if(result>0){
            return new CommonResult(200,"插入数据库成功",result);
        }else {
            return new CommonResult(444,"插入数据库成功失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("******查询数据库结果:"+payment);

        if(payment != null ){
            return new CommonResult(200,"查询数据库成功",payment);
        }else {
            return new CommonResult(444,"查询数据库没有记录,查询ID:" + id ,null);
        }
    }

    @RequestMapping("/hello")
    public String hello(String name){
        return "Hello Payment --- " + name;
    }

}
