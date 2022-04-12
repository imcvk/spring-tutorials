package com.springdi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class TestDI {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationConfig.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Employee e = (Employee) beanFactory.getBean("employee");
		e.show();
	}
}
