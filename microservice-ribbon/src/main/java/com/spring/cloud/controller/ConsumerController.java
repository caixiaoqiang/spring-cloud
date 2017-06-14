package com.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * Created by cxq on 2017/6/7.
 */
@Controller
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;


    @RequestMapping("/add")
    @ResponseBody
    public  String add(@RequestParam(value = "a")int a,@RequestParam(value = "b")int b){

        return restTemplate.getForEntity("http://COOKIE-SERVICE/add?a="+a+"&b="+b,String.class).getBody();
    }
}
