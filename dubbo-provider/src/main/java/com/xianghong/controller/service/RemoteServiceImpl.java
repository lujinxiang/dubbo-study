package com.xianghong.controller.service;

import com.xianghong.facade.RemoteService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author jinxianglu
 */
@DubboService
public class RemoteServiceImpl implements RemoteService {

    public String sayHello(String name) {
        return "hello world " + name;
    }
}
