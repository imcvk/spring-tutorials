package com.springdi.Setter_Injection_with_Non_String_Map_having_dependent_Object;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContextForSetter_Injection_with_Non_String_Map_having_dependent_Object.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Question q = (Question) factory.getBean("q");
        q.displayInfo();

    }
}
