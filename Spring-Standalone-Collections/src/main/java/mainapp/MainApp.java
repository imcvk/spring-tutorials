package mainapp;

import beans.Subjects;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Subjects list = (Subjects) context.getBean("subjects");
        System.out.println(list);

    }
}
