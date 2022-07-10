package com.xianghong.facade;

/**
 * @author jinxianglu
 */
public interface RemoteService {

    /**
     * sayHello dubbo服务
     *
     * @param name
     * @return
     */
    public String sayHello(String name);

}
