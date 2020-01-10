package com.chen.demo.dubbo.provider;

import java.util.List;

/**
 * @author koma 10:49 2020-01-10
 * @desc
 */
public interface DemoService {
    String sayHello(String name);
    public List getUser();
}
