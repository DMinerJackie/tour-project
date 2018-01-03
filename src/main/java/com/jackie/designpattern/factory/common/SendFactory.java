package com.jackie.designpattern.factory.common;

import com.jackie.designpattern.MailSender;
import com.jackie.designpattern.Sender;
import com.jackie.designpattern.SmsSender;

/**
 * 普通工厂模式，根据输入的类型决定输出相应的对象
 * Created by jackie on 18/1/2.
 */
public class SendFactory {

    public Sender produce(String sendType) {
        if ("mail".equals(sendType)) {
            return new MailSender();
        } else if ("sms".equals(sendType)) {
            return new SmsSender();
        } else {
            return null;
        }
    }
}
