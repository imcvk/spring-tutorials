package com.beanlifecycleusinginterfaces.Demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pen implements InitializingBean, DisposableBean {
    Pen() {
        super();
    }

    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "price=" + price +
                '}';
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Pen initialized....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Pen destroyed....");
    }
}
