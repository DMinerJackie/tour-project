package com.jackie.designpattern.prototype;

/**
 * Created by jackie on 18/1/5.
 */
public class Client {

    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public void operation(Prototype example) {
        Prototype prototype = (Prototype) example.clone();
    }
}
