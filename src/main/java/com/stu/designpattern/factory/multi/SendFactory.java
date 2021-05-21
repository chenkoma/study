package com.stu.designpattern.factory.multi;

import com.stu.designpattern.factory.simple.MailSender;
import com.stu.designpattern.factory.simple.Sender;
import com.stu.designpattern.factory.simple.SmsSender;

/**
 * @Date: 3:23 下午 2021/5/21
 * @Desc: 多工厂模式
 */
public class SendFactory {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }

}
