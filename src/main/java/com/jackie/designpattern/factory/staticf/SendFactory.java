package com.jackie.designpattern.factory.staticf;

import com.jackie.designpattern.MailSender;
import com.jackie.designpattern.Sender;
import com.jackie.designpattern.SmsSender;

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
