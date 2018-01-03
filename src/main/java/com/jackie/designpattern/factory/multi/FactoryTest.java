package com.jackie.designpattern.factory.multi;

import com.jackie.designpattern.Sender;

/**
 * Created by jackie on 18/1/2.
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sender1 = sendFactory.produceMail();
        sender1.send();

        Sender sender2 = sendFactory.produceSms();
        sender2.send();
    }
}
