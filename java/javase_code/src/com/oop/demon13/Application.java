package com.oop.demon13;

public class Application {
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.out();

        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getId();
    }
}
