package com.jackie.designpattern.adapter;

/**
 * 对象适配，不继承Source，通过持有Source的实例获取Source的能力
 * Created by jackie on 18/3/29.
 */
public class ObjAdapter implements Targetable {

    private Source source;

    public ObjAdapter(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is method2");
    }
}
