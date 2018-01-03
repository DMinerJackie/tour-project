package com.jackie.designpattern.factory;

/**
 * Created by jackie on 18/1/2.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailSender");
    }
}
