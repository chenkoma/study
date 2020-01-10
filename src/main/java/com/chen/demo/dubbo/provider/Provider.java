package com.chen.demo.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author koma 11:27 2020-01-10
 * @desc
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-test.xml");
        context.start();
        System.in.read();
    }
}
