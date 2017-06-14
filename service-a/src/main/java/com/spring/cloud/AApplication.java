package com.spring.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by cxq on 2017/6/13.
 */

@SpringBootApplication
@EnableDiscoveryClient
public class AApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AApplication.class).web(true).run(args);
    }
}
