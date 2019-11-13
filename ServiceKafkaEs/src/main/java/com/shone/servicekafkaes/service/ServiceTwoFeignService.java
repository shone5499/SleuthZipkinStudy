package com.shone.servicekafkaes.service;

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
@FeignClient(value = "Service2")
public interface ServiceTwoFeignService {

    /**
     *  调用/test/get3接口
     * @return String
     */
    @GetMapping("/test/get3")
    String getFromClientThree();

    /**
     *  调用/test/get4接口
     * @return String
     */
    @GetMapping("/test/get4")
    String getFromClientFour();
}
