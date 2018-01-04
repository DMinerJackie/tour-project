package com.jackie.designpattern.builder;

/**
 * Created by jackie on 18/1/4.
 */
public abstract class Person {
    private String name;
    private String sex = setSex();
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String setSex();
}
