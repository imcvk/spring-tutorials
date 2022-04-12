package com.springdi.dependency_injection_using_setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationConfig.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Employee e = (Employee) beanFactory.getBean("emp");
        e.show();
    }
}
