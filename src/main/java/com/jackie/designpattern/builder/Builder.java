package com.jackie.designpattern.builder;

/**
 * Created by jackie on 18/1/4.
 */
public abstract class Builder<T> {

    public abstract Builder setName(String name);

    public abstract Builder setSex(String sex);

    public abstract Builder setAge(int age);

    public abstract <T extends Person> T build();
}
