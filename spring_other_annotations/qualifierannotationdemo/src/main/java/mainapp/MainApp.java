package mainapp;

import beans.Profile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Profile p1 = (Profile) context.getBean("profile");
        System.out.println(p1);
    }
}
