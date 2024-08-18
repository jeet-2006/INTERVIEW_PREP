package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSamosa {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Samosa s1 = (Samosa) context.getBean("s1");

        //registering shutdown hook it will call init and destroy method
        context.registerShutdownHook();
        System.out.println(s1);
    }
}
