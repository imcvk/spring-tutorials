package com.beanlifecycleusinginterfaces.Demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Blackboard implements InitializingBean, DisposableBean {
    @Override
    public String toString() {
        return "Blackboard{" +
                "price=" + price +
                '}';
    }

    double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Blackboard() {
        super();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Blackboard Destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Blackboard Initialized...");
    }
}
