package com.uncleyong.dubbotest.main;

import com.alibaba.dubbo.config.annotation.Service;
import com.uncleyong.dubbotest.service.SayHelloToClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * @Date: 2:20 下午 2021/2/2
 * @Desc:
 */
public class TestSayHelloToClient {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});

    @Test()
    private void testSayHello() {
        context.start();
        SayHelloToClient say = (SayHelloToClient) context.getBean("sayhellotoclient");
        String res = say.sayHello("UncleYong");
        System.out.println(res);
        new Scanner(System.in).next();
    }

}
