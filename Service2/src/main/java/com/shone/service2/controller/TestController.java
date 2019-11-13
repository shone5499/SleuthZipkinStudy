package com.shone.service2.controller;

import com.shone.service2.service.ServiceFourFeignService;
import com.shone.service2.service.ServiceThreeFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoClass
 *
 * @author Xiao GuoJian
 * @date 2019/11/13 下午3:49
 */

@RestController
@RequestMapping("/test")
public class TestController {

    private String pre = "Service2 Controller from ";

    @Autowired
    private ServiceThreeFeignService serviceThreeFeignService;

    @Autowired
    private ServiceFourFeignService serviceFourFeignService;

    @GetMapping("/get3")
    public String get3(){
        System.out.println("Service2 Controller 调用Service3");
        return pre + serviceThreeFeignService.getFromClient();
    }

    @GetMapping("/get4")
    public String get4(){
        System.out.println("Service2 Controller 调用Service4");
        return pre + serviceFourFeignService.getFromClient();
    }
}
