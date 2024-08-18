package com.springcore.autoconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee e = context.getBean("emp1", Employee.class);
        System.out.println(e);
    }
}
