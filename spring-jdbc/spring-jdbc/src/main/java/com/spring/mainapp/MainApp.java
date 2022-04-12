package com.spring.mainapp;

import com.spring.dao.StudentDAO;
import com.spring.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Started...");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDAO studentDAO = (StudentDAO) context.getBean("daoimpl");
        System.out.println("INSERTING DATA");
        Student student = new Student(2303, "Chaitanya", "Solapur");
        System.out.println(studentDAO.insert(student) + " record inserted...");
        System.out.println("UPDATING DATA");
        student = new Student(45654, "Johnny walkery ", "Pune");
        System.out.println(studentDAO.update(student) + " record updated...");
        System.out.println("DELETING DATA");
        int studentIdDeleteRecord = 2303;
        System.out.println(studentDAO.delete(studentIdDeleteRecord)+" record deleted...");

        System.out.println("READING ONE ROW");
        Student st=studentDAO.getStudent(45654);
        System.out.println(st.getId()+","+st.getName()+","+st.getCity());

        //Get Multiple rows
        System.out.println("READING MULTIPLE ROW");
        List<Student> list = studentDAO.getAllStudents();
        for (Student std : list) {
            System.out.println("Id:" + std.getId() + ",Name:" + std.getName() + ",City:" + std.getCity());
        }
    }
}
