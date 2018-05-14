package com.jackie.designpattern.proxy;

/**
 * Created by jackie on 2018/5/14.
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
