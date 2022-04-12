package com.spring.orm.xml.mainapp;

import com.spring.orm.xml.dao.TeacherDAO;
import com.spring.orm.xml.entities.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        TeacherDAO dao=(TeacherDAO) context.getBean("teacher");
        Teacher t=new Teacher(1232,"dfsdfs","sdfsdfs");
        int r=dao.insert(t);
        System.out.println(r+"record inserted....");
/*
        Scanner sc = new Scanner(System.in);
        boolean breakpoint = true;
        while (breakpoint) {
            System.out.println(
                    "1: Insert" + " " +
                            "2:Display All" + " " +
                            "3:Display Single" + " " +
                            "4:Delete" + " " +
                            "5:Update" + " " +
                            "6:Exit"

            );
            int choice = sc.nextInt();
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;

            }

        }
   */
    }

}
