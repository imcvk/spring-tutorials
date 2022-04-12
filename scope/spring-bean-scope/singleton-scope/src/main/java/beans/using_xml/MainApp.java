package beans.using_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Teacher teacher1 = (Teacher) context.getBean("teacher");
        System.out.println(teacher1.hashCode());
        Teacher teacher2 = (Teacher) context.getBean("teacher");
        System.out.println(teacher2.hashCode());
    }

}
