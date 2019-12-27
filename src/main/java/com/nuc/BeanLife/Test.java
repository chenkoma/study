package com.nuc.BeanLife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author koma 19:53 2019-08-14
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("testBean.xml");
        PersonService person1 = (PersonService) ac.getBean("personService");
        person1.sayHi();

    }
}
