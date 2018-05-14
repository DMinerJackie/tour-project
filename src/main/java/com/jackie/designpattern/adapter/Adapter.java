package com.jackie.designpattern.adapter;

/**
 * 类适配，通过继承Source将其功能扩展到Targetable
 * Created by jackie on 18/3/28.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is targetable method");
    }
}
