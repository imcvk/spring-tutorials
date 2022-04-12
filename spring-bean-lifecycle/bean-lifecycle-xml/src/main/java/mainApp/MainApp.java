package mainApp;

import beans.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//        AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationconfig.xml");
//        context.registerShutdownHook();
        //Or you can use below code to initialize context and bean..
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationconfig.xml");

        Book b = (Book) context.getBean("book");
        b.printName();
        context.close();
    }
}
