package mainapp;

import config.JavaConfig;
import dao.StudentDAO;
import dao.StudentDAOImpl;
import entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentDAOImpl dao=context.getBean("Studentdaoimpl",StudentDAOImpl.class);
        int r=dao.insert(new Student(94456,"Chaitanya","abc"));
        System.out.printf(r+"record inserted...");
    }
}
