package com.spring.cloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by cxq on 2017/6/13.
 */
public class ErrorFilter extends ZuulFilter {
    private static Logger log = Logger.getLogger(ErrorFilter.class);


    @Override
    public String filterType() {
        return "error";
    }


    @Override
    public int filterOrder() {
        return 0;
    }


    @Override
    public boolean shouldFilter() {
        return true;
    }


    @Override
    public Object run() {

        log.info(" get into fallback method");
            doSomething();
        return null;
    }

    public void doSomething(){
        throw  new RuntimeException(" something is wrong !");
    }
}
