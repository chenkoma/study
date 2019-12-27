package com.shiyanlou.spring;

import com.shiyanlou.spring.bean.User;
import com.shiyanlou.spring.bean.User2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)ac.getBean("user");
        System.out.println(user.getName());
        user.sayHello();

        User2 user2 = (User2)ac.getBean("user2");
        user2.sayBye();
    }
}
