package mainapp;

import beans.on_constructor.Emp3;
import beans.on_properties.Emp2;
import beans.on_setter_method.Emp1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //by using @Autowired on setter method.
        Emp1 e1 = (Emp1) context.getBean("emp1");
        System.out.println("Using @Autowired on setter method:  "+e1);

        //by using @Autowired on properties
        Emp2 e2 = (Emp2) context.getBean("emp2");
        System.out.println("Using @Autowired on properties: "+e2);

        //by using @Autowired on constructor
        Emp3 e3 = (Emp3) context.getBean("emp3");
        System.out.println("Using @Autowired on Constructor: "+e3);
    }
}
