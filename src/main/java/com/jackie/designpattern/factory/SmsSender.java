package com.jackie.designpattern.factory;

/**
 * Created by jackie on 18/1/2.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is smsSender");
    }
}
