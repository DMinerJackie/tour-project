package com.jackie.designpattern.factory.multi;

import com.jackie.designpattern.factory.MailSender;
import com.jackie.designpattern.factory.Sender;
import com.jackie.designpattern.factory.SmsSender;

/**
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
