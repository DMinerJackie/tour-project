package com.jackie.designpattern.factory.common;

import com.jackie.designpattern.factory.MailSender;
import com.jackie.designpattern.factory.Sender;
import com.jackie.designpattern.factory.SmsSender;

/**
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
