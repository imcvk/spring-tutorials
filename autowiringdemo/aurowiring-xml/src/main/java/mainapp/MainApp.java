package mainapp;

import beans.Address;
import beans.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Emp e= (Emp) context.getBean("emp");
        e.setAddress(new Address("Sangola","Maharashtra"));
        System.out.print(e);
    }
}
