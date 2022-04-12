package mainapp;

import beans.Book;
import beans.Student;
import config.Javacnfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Javacnfig.class);
        //fetching bean having @Component annotation.
        Student student = context.getBean("student", Student.class);
        System.out.println(student);

        // Bean using @Bean annotation
        Book b = context.getBean("getBook", Book.class);
        b.getName();

    }
}
