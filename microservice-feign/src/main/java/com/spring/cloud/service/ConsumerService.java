package com.spring.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by cxq on 2017/6/7.
 */
@FeignClient("cookie-service")
public interface ConsumerService {

    @RequestMapping("/add")
    Integer add(@RequestParam(value = "a")int a,@RequestParam(value = "b")int b);

}
