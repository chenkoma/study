package com.itnba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author koma 17:59 2019-09-19
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        //要用接口接收
        IHuman c= (IHuman)context.getBean("chinese");
        c.chifan();
        c.shuijiao();
        System.out.println("*********************************");
        //要用接口接收
        IHuman a= (IHuman) context.getBean("american");
        a.chifan();
        a.shuijiao();

    }
}
