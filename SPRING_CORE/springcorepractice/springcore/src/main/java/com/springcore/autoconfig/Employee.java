package com.springcore.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    @Autowired
    Address address;

    public Employee() {
    }

    public Employee(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
