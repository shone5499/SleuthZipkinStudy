package com.shone.service2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Feign调用Service1服务
 *
 * @author Xiao GuoJian
 * @date 2019/11/13 下午3:50
 */

@Service
@FeignClient(value = "Service4")
public interface ServiceFourFeignService {

    /**
     *  调用/test/get接口
     * @return String
     */
    @GetMapping("/test/get")
    String getFromClient();
}
