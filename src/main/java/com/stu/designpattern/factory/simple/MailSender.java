package com.stu.designpattern.factory.simple;

/**
 * @Date: 11:03 上午 2021/5/21
 * @Desc:
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mail sender!");
    }
}
