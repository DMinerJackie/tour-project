package com.jackie.designpattern.factory.multi;

import com.jackie.designpattern.MailSender;
import com.jackie.designpattern.Sender;
import com.jackie.designpattern.SmsSender;

/**
 * 多个工厂方法模式，工厂类提供多个工厂方法，分别创建对象
 * Created by jackie on 18/1/2.
 */
public class SendFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
