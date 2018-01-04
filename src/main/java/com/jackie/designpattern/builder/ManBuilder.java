package com.jackie.designpattern.builder;

/**
 * Created by jackie on 18/1/4.
 */
public class ManBuilder extends Builder<Man> {
    private String name;
    private String sex;
    private int age;

    @Override
    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder setSex(String sex) {
        this.sex = sex;
        return this;
    }

    @Override
    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public <T extends Person> T build() {
        Person man = new Man();
        man.setName(name);
        man.setSex(sex);
        man.setAge(age);
        return (T) man;
    }
}
