package com.uncleyong.dubbotest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Date: 3:21 下午 2021/2/1
 * @Desc:
 */
public class ProviderMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
        System.out.println("注册成功，如想退出，按任间键退出");
        System.in.read();
    }
}
