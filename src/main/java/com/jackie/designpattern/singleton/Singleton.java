package com.jackie.designpattern.singleton;

/**
 * Created by jackie on 18/1/4.
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void sayHello() {
        System.out.println("hello, this is singleton design pattern");
    }
}
