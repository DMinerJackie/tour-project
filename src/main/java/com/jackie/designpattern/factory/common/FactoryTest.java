package com.jackie.designpattern.factory.common;

import com.jackie.designpattern.Sender;

/**
 * Created by jackie on 18/1/2.
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sender1 = sendFactory.produce("mail");
        sender1.send();

        Sender sender2 = sendFactory.produce("sms");
        sender2.send();
    }
}
