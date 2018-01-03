package com.jackie.designpattern.abstractfactory;

import com.jackie.designpattern.Sender;

/**
 * Created by jackie on 18/1/3.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        Provider mailProvider = new SendMailFactory();
        Sender mailSender = mailProvider.produce();
        mailSender.send();

        Provider smsProvider = new SendSmsFactory();
        Sender smsSender = smsProvider.produce();
        smsSender.send();
    }
}
