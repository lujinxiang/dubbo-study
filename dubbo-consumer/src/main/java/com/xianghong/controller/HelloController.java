package com.xianghong.controller;

import com.xianghong.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinxianglu
 */
@RestController
public class HelloController {

    @Autowired
    private SayHelloService sayHelloService;


    @GetMapping("/hello")
    public String sayHello(String name) {
        return sayHelloService.sayHello(name);
    }


}
