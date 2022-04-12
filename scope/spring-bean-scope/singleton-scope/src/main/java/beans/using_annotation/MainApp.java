package beans.using_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) context.getBean("student");
        System.out.println(student1.hashCode());
        Student student2 = (Student) context.getBean("student");
        System.out.println(student2.hashCode());
    }
}
