package com.springdi.Constructor_Injection_with_Dependent_Object;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class MainApp {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationConfig2.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Employee e = (Employee) beanFactory.getBean("employee");
		e.showEmpDetails();
	}
}
