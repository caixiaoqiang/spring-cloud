package com.spring.cloud.service;

import com.spring.cloud.service.impl.ConsumerServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by cxq on 2017/6/7.
 */
@FeignClient(value = "cookie-service",fallback = ConsumerServiceImpl.class)
public interface ConsumerService {

    @RequestMapping("/add")
    Integer add(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b);

}
