package bean.xmlbased;

import bean.xmlbased.Manager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config2.xml");
        Manager manager1=context.getBean("manager",Manager.class);
        System.out.println(manager1.hashCode());
        Manager manager2=context.getBean("manager",Manager.class);
        System.out.println(manager2.hashCode());
    }
}
