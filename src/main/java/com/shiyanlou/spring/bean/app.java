package com.shiyanlou.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    private static ApplicationContext context;
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");

        FileNameGenerator fng = (FileNameGenerator)context.getBean("FileNameGenerator");
        fng.printFileName();
    }
}
