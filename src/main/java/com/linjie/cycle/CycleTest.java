package com.linjie.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * @author koma 14:55 2019-08-27
 * @desc
 */
public class CycleTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("testBean3.xml");
        Student student = (Student) context.getBean("student");

        // bean的使用
        student.play();
        System.out.println(student);
        // 关闭容器
        ((AbstractApplicationContext) context).close();
    }
}
