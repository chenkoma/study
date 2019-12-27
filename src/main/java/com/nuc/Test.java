package com.nuc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

/**
 * @author koma 10:55 2019-06-20
 * @desc
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 调用change不使用接口
//        UpperLetter changeLstter = (UpperLetter)ac.getBean("changeLetter");
//        System.out.println(changeLstter.change());

        // 使用接口
        ChangeLetter changeLetter = (ChangeLetter)ac.getBean("changeLetter");
        System.out.println(changeLetter.change());

//        String jobId = "add_job_" + new Date().getTime()/1000;

        LinkedList<String> lList = new LinkedList<>();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        System.out.println("链表的第一个元素是：" + lList.getFirst());

        for (String str:lList) {
            System.out.println(str);
        }

        System.out.println("===========");
        Thread.sleep(1000);
        System.out.println("===========");


    }
}
