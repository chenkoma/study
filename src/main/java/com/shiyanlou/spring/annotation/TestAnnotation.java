package com.shiyanlou.spring.annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;


/**
 * @author koma 19:55 2019-07-09
 * @desc
 */
public class TestAnnotation {

    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Zoo zoo = (Zoo) ac.getBean("zoo");
        System.out.println(zoo.toString());
    }

}
