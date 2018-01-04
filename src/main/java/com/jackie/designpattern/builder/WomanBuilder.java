package com.jackie.designpattern.builder;

/**
 * Created by jackie on 18/1/4.
 */
public class WomanBuilder extends Builder<Woman> {
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
        this.age =age;
        return this;
    }

    @Override
    public <T extends  Person> T build() {
        Person woman = new Woman();
        woman.setName(name);
        woman.setSex(sex);
        woman.setAge(age);
        return (T) woman;
    }
}
