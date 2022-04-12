package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config-staticfactorymethodreturnsinstanceofanotherclass.xml");
        Printable p = (Printable) context.getBean("p");
        p.print();
    }
}
