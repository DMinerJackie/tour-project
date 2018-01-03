package com.jackie.designpattern.abstractfactory;

import com.jackie.designpattern.MailSender;
import com.jackie.designpattern.Sender;

/**
 * Created by jackie on 18/1/3.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
