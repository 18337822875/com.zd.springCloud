package com.zd.springCloud.controller;

import com.zd.springCloud.entities.CommonResult;
import com.zd.springCloud.entities.Payment;
import com.zd.springCloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zd
 * @time: 2020/10/21 22:26
 */


/**
 *
 * @Controller和@RestController的区别
 *
 * RestController注解相当于ResponseBody+controller
 *
 * Controller类中的方法可以直接通过返回String跳转到jsp、ftl、html等模版页面。
 * 在方法上加@ResponseBody注解，也可以返回实体对象。
 *
 * 只能返回String，Object，Json等实体对象，不能跳转页面
 *@RestController中的方法如果想跳转页面，则用ModelAndView进行封装，如下：
 *
 * @RestController
 * public class UserController {
 *     @RequestMapping(value = "/index",method = RequestMethod.GET)
 *     public String toIndex(){
 *         ModelAndView mv = new ModelAndView("index");
 *           return mv;
 *     }
 * }
 */



@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("===========插入结果："+result);

        if(result>0){
            return new CommonResult(200,"插入数据成功",result);
        }else{
            return new CommonResult(456,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("===========插入结果："+payment);

        if(payment !=null){
            return new CommonResult(200,"查询成功",payment);
        }else{
            return new CommonResult(456,"没有查到记录"+id,null);
        }
    }

}
