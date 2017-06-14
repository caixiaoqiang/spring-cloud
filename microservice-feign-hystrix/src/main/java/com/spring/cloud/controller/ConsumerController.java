package com.spring.cloud.controller;

import com.spring.cloud.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cxq on 2017/6/7.
 */
@RestController
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

    @RequestMapping("/add")
    public Integer add(@RequestParam(value = "a")int a, @RequestParam(value = "b")int b){
        return consumerService.add(a,b);
    }
}
