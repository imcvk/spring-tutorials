package config;

import beans.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javacnfig {
    @Bean
    public Book getBook() {
        return new Book();
    }
}
