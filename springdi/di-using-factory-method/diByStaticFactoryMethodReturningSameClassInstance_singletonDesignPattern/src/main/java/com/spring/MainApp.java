package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("configForDiByStaticFactoryMethod.xml");
        A a = (A)context.getBean("a");
        a.msg();
    }
}
