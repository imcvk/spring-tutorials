package com.beanlifecycleAnnotations.mainapp;

import com.beanlifecycleAnnotations.Demo.TestExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        TestExample testExample=context.getBean("test",TestExample.class);
        System.out.println(testExample.toString());
    }
}
