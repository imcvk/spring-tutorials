package com.springdi.inheriting_bean_in_spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContextForBeanInheritance.xml");
		BeanFactory bean = new XmlBeanFactory(resource);
		Employee e = (Employee) bean.getBean("e1");
		e.show();
		Employee e2 = (Employee) bean.getBean("e2");
		e2.show();
	}
}
