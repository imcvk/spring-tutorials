package com.springdi.Setter_Injection_With_Map_Example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContextForSetterInjectionWithMap.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Questions questions = (Questions) beanFactory.getBean("q");
        questions.displayInfo();
    }
}
