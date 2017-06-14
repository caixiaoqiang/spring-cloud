package com.spring.cloud.service.impl;

import com.spring.cloud.service.ConsumerService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by cxq on 2017/6/7.
 */
@Component
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public Integer add(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b) {
        return 400;
    }
}
