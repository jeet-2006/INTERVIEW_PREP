package com.java.practice;

public class MethodOverloading {

//    public void sum(int a, char b, String s) {
//        System.out.println(a+b+s+ ": int");
//    }

    public void sum(int a, long b) {
        System.out.println(a+b+ "ambigity");
    }
    public void sum(long a, int b) {
        System.out.println(a+b+ ": Double");
    }
    public static void main(String args[]) {
        MethodOverloading mo = new MethodOverloading();
//        mo.sum(10, '2', "hello");
        mo.sum(10, 2000000l);// type promotion 20 to 20.0
    }
}
