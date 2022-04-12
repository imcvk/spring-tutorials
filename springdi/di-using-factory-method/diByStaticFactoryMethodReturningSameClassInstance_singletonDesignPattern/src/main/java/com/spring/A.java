package com.spring;

public class A {
    private static A a = new A();

    A() {
        System.out.println("Default Constructor");
    }

    public static A getA() {
        return a;
    }

    public void msg() {
        System.out.println("In class A...");
    }
}
