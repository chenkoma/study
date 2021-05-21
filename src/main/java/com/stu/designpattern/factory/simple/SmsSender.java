package com.stu.designpattern.factory.simple;

/**
 * @Date: 11:06 上午 2021/5/21
 * @Desc:
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
