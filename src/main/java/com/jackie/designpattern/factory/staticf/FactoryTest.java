package com.jackie.designpattern.factory.staticf;

import com.jackie.designpattern.factory.Sender;

/**
 * Created by jackie on 18/1/3.
 */
public class FactoryTest {

    public static void main(String[] args) {
        Sender sender1 = SendFactory.produceMail();
        sender1.send();

        Sender sender2 = SendFactory.produceSms();
        sender2.send();
    }
}
