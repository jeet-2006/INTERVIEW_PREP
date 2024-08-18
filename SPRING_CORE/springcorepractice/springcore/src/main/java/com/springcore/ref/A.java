package com.springcore.ref;

public class A {
    int x;
    B b;

    public A(int x, B b) {
        this.x = x;
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", b=" + b +
                '}';
    }
}
