package com.nuc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.beans.beancontext.BeanContext;

/**
 * @author koma 11:22 2019-06-25
 * @desc bean作用域
 */
public class TestStudent {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//        factory.getBean("student");
//
        Student stu1 = (Student)ac.getBean("student");
        Student stu2 = (Student)ac.getBean("student");
        System.out.println(stu1 + " " + stu2);
    }
}
