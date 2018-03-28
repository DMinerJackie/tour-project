package com.jackie.designpattern.adapter;

/**
 * Created by jackie on 18/3/28.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is targetable method");
    }
}
