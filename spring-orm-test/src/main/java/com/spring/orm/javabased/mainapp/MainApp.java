package com.spring.orm.javabased.mainapp;

import com.spring.orm.javabased.config.JavaConfig;
import com.spring.orm.javabased.dao.HOD_Dao;
import com.spring.orm.javabased.entities.HOD;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        HOD_Dao dao = (HOD_Dao) context.getBean("getHod_dao");
        HOD hod = new HOD(12324, "dfsdfs", "sdfsdfs");
        int r = dao.insert(hod);
        System.out.println(r + "record inserted....");

    }

}
