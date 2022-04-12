package com.beanlifecycleAnnotations.Demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    public Example() {
        super();
    }

    public String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("initiated....");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Destroyed....");
    }
}
