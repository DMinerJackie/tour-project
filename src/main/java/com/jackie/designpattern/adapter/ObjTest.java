package com.jackie.designpattern.adapter;

/**
 * Created by jackie on 18/3/29.
 */
public class ObjTest {
    public static void main(String[] args) {
        ObjAdapter objAdapter = new ObjAdapter(new Source());
        objAdapter.method1();
        objAdapter.method2();
    }
}
