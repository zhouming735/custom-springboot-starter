package com.lomen.mestarterdemo.api;

import com.lomen.me.service.HelloService;
import com.lomen.me.service.StarterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试验证自定义starter
 */
@RestController
public class HelloApi {

    @Autowired
    HelloService helloService;
    @Autowired
    StarterService starterService;

    @RequestMapping("/hello")
    public String hello(){
        return helloService.sayHello();
    }
    @RequestMapping("/config")
    public String starterService(){
        String[] sps=starterService.split(",");
        return String.join("###",sps);
    }
}

