package com.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cxq on 2017/6/7.
 */

@RestController
@RefreshScope
public class ClientController {

    @Value("from")
    private String from;

    @RequestMapping("/from")
    public String from(){
        return this.from;
    }
}
