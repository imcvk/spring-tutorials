package config;

import beans.Student;
import beans.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {

    @Bean
    public Student getStudent() {
        return new Student();
    }

    @Bean
    public Teacher getTeacher() {
        return new Teacher();
    }
}
