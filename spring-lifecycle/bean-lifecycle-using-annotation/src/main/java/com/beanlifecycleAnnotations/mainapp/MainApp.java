package com.beanlifecycleAnnotations.mainapp;

import com.beanlifecycleAnnotations.Demo.Example;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.registerShutdownHook();

        Example eg=context.getBean("eg",Example.class);
        System.out.println("\n\n"+eg);
    }
}
