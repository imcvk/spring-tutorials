package com.beanlifecycleUsingXML.mainapp;

import com.beanlifecycleUsingXML.Demo.Book;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.registerShutdownHook();
        Book b = context.getBean("book", Book.class);
        System.out.println("\nBook:" + b);

    }
}
