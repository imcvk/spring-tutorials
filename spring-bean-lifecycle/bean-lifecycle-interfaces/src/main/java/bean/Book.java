package bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Book implements DisposableBean, InitializingBean {
    String name;
    String auther;

    Book() {
    }

    public Book(String name, String auther) {
        this.name = name;
        this.auther = auther;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", auther='" + auther + '\'' +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroyed...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialized...");
    }
}
