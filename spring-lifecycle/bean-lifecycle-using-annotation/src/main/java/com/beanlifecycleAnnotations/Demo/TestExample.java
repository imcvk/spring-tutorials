package com.beanlifecycleAnnotations.Demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestExample {
    TestExample() {
        super();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    String msg;

    @Override
    public String toString() {
        return "TestExample{" +
                "msg='" + msg + '\'' +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("initiated...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroyed...");
    }
}
