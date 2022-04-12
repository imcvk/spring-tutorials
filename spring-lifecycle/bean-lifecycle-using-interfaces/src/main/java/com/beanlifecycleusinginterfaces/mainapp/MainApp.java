package com.beanlifecycleusinginterfaces.mainapp;

import java.awt.print.Book;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.beanlifecycleusinginterfaces.Demo.*;

public class MainApp {
	public static void main(String[] args) {

//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		context.registerShutdownHook();
//
//		Pen pen = context.getBean("pen", Pen.class);
//		Book b = context.getBean("book1", Book.class);
//		System.out.println("\nBook:" + b);
//		System.out.println("\nPen: " + pen);


		AbstractApplicationContext abstractApplicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Blackboard bb= abstractApplicationContext.getBean("bb",Blackboard.class);
		System.out.println(bb.toString());
	}
}
