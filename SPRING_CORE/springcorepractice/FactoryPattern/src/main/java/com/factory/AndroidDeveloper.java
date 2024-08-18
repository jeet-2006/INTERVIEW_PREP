package com.factory;

public class AndroidDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Getting AndroidDeveloper salary");
        return 50000;
    }
}
