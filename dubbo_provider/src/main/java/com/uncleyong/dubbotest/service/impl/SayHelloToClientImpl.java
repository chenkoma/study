package com.uncleyong.dubbotest.service.impl;

import com.uncleyong.dubbotest.service.SayHelloToClient;

/**
 * @Date: 2:27 下午 2021/2/1
 * @Desc:
 */
public class SayHelloToClientImpl implements SayHelloToClient {
    @Override
    public String sayHello(String name) {
        System.out.println("from client :" + name);
        return "hello, " + name;
    }
}
