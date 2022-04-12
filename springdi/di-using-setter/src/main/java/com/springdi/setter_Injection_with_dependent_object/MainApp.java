package com.springdi.setter_Injection_with_dependent_object;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContextfordiDependentobjectbyconstructor.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee e = (Employee) factory.getBean("emp");
		e.displayInfo();
	}
}
