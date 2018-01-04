package com.jackie.designpattern.singleton;

/**
 * Created by jackie on 18/1/4.
 */
public class SingletonTest {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.sayHello();
    }
}
