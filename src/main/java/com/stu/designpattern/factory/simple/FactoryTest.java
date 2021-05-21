package com.stu.designpattern.factory.simple;

/**
 * @Date: 2:40 下午 2021/5/21
 * @Desc:
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }
}
