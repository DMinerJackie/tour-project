package com.jackie.designpattern.factory.staticf;

import com.jackie.designpattern.factory.MailSender;
import com.jackie.designpattern.factory.Sender;
import com.jackie.designpattern.factory.SmsSender;

/**
 * Created by jackie on 18/1/3.
 */
public class SendFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
