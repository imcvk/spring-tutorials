package com.beanlifecycleusinginterfaces.Demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Book  implements InitializingBean, DisposableBean {
    public double price;

    public Book() {
        super();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price.");
        this.price = price;
    }


    public String toString() {
        return "Book{" +
                "price=" + price +
                '}';
    }
    public void afterPropertiesSet() throws Exception {
        System.out.println("Book initialized....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Book destroyed....");
    }
}
