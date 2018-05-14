package com.jackie.designpattern.proxy;

/**
 * Created by jackie on 2018/5/14.
 */
public class Main {

    public static void main(String[] args) {
        Sourceable sourceable = new Proxy();
        sourceable.method();
    }
}
