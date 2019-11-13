package com.shone.servicekafkaes.controller;

import com.shone.servicekafkaes.service.ServiceTwoFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * service1调用service2
 * 并且service2调用service3和service4
 *
 * @author Xiao GuoJian
 * @date 2019/11/13 下午2:31
 */

@RestController
@RequestMapping("/test")
public class TestController {



    private String pre = "ServiceKafkaElasticSearch Controller from ";

    @Autowired
    private ServiceTwoFeignService serviceTwoFeignService;

    @GetMapping("/get3")
    public String get3(){
        System.out.println("ServiceKafkaElasticSearch Controller 调用Service2 调用Service3");
        return pre + serviceTwoFeignService.getFromClientThree();
    }

    @GetMapping("/get4")
    public String get4(){
        System.out.println("ServiceKafkaElasticSearch Controller 调用Service2 调用Service4");
        return pre + serviceTwoFeignService.getFromClientFour();
    }
}
