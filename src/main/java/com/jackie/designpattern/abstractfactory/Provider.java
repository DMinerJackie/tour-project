package com.jackie.designpattern.abstractfactory;

import com.jackie.designpattern.Sender;

/**
 * Created by jackie on 18/1/3.
 */
public interface Provider {

    public Sender produce();
}
