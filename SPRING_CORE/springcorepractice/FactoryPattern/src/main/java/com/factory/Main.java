package com.factory;

public class Main {
    public static void main(String[] args) {
        Employee emp = EmployeeFactory.getEmployee("Web");
        System.out.println(emp.getSalary());

        emp = EmployeeFactory.getEmployee("Android");
        System.out.println(emp.getSalary());
    }
}