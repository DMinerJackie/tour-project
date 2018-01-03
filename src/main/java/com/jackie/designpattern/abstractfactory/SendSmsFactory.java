package com.jackie.designpattern.abstractfactory;

import com.jackie.designpattern.Sender;
import com.jackie.designpattern.SmsSender;

/**
 * Created by jackie on 18/1/3.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
