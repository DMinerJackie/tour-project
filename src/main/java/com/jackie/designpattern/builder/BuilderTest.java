package com.jackie.designpattern.builder;

/**
 * Created by jackie on 18/1/4.
 */
public class BuilderTest {

    public static void main(String[] args) {
        Builder builder = new ManBuilder();
        Man man = (Man)builder.setName("jackie").setSex("male").setAge(18).build();
        System.out.println(man.getName());

        builder = new WomanBuilder();
        Woman woman = (Woman) builder.setName("lily").setSex("female").setAge(18).build();
        System.out.println(woman.getName());
    }
}
