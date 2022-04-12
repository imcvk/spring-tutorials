package bean.annotationbased;

import bean.annotationbased.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Employee emp1=context.getBean("employee",Employee.class);
        System.out.println(emp1.hashCode());
        Employee emp2=context.getBean("employee",Employee.class);
        System.out.println(emp2.hashCode());
    }
}
