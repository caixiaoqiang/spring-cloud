package com.spring.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * Created by cxq on 2017/6/7.
 */
@Service
public class HystrixService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "rollBack")
    public Object add(int a, int b){
            return restTemplate.getForEntity("http://COOKIE-SERVICE/add?a="+a+"&b="+b,String.class).getBody();
    }

    public Object rollBack(int a, int b){
       return  "error";
    }
}
