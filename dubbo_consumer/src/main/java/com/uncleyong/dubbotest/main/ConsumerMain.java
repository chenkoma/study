package com.uncleyong.dubbotest.main;

import com.uncleyong.dubbotest.service.SayHelloToClient;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * @Date: 10:39 上午 2021/2/2
 * @Desc:
 */
public class ConsumerMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();

        SayHelloToClient say = (SayHelloToClient) context.getBean("sayhellotoclient");
        String res = say.sayHello("UncleYong");
        System.out.println(res);
        new Scanner(System.in).next();
    }

}
