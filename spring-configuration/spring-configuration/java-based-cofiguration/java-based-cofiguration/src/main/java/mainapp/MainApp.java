package mainapp;

import beans.Student;
import beans.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("config");
        Student student=context.getBean("getStudent",Student.class);
        student.activity();
        Teacher teacher=context.getBean("getTeacher",Teacher.class);
        teacher.activity();
    }
}
