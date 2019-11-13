package com.shone.service3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoClass
 *
 * @author Xiao GuoJian
 * @date 2019/11/13 下午2:31
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get")
    public String get(){
        return "Service3 Controller Output!";
    }
}
