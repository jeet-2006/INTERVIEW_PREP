package com.factory;

public class WebDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Getting WebDeveloper salary");
        return 70000;
    }
}
