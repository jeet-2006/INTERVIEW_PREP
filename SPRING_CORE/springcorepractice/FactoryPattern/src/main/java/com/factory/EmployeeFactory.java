package com.factory;

public class EmployeeFactory {
    public static Employee getEmployee(String type) {
        if (type.trim().equalsIgnoreCase("Web"))
            return new WebDeveloper();

        if (type.trim().equalsIgnoreCase("Android"))
            return new AndroidDeveloper();

        return null;
    }
}
