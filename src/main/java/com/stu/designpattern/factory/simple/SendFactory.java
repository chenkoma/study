package com.stu.designpattern.factory.simple;

import javax.xml.ws.Provider;

/**
 * @Date: 11:39 上午 2021/5/21
 * @Desc:
 */
public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("error type");
            return null;
        }
    }
}
