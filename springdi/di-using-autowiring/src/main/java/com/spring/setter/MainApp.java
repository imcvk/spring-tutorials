package com.spring.setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("configForautowiringdemo.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        A a = (A) beanFactory.getBean("a");
        a.print();
    }
}
