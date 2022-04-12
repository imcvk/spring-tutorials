package config;

import beans.Book;
import beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Book getBook() {
        return new Book();
    }

    @Bean
    public Student getStudent() {
        //creating new object
        Student student = new Student(getBook());
        return student;
    }
}
