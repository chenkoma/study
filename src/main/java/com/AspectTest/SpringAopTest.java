package com.AspectTest;

import org.testng.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.AspectTest.service.personServer;
import org.testng.annotations.Test;

/**
 * @author koma 20:33 2019-09-19
 * @desc
 */
public class SpringAopTest {
    @Test
    public void inteceptorTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-aop.xml");
        personServer bean = (personServer)ctx.getBean("personServiceBean");
        bean.save("badMonkey",23);

//          personServer p = new personServerImpl();//通过new对象是不会触发aop的
//          p.save("11", "22");
    }
}
