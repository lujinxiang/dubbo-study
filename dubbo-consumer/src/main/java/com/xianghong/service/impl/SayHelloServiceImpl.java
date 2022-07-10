package com.xianghong.service.impl;

import com.xianghong.facade.RemoteService;
import com.xianghong.service.SayHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author jinxianglu
 */
@Service
public class SayHelloServiceImpl implements SayHelloService {


    @DubboReference
    private RemoteService remoteService;


    public String sayHello(String name) {
        return remoteService.sayHello(name);
    }
}
