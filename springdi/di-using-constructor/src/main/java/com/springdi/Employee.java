package com.springdi;

public class Employee {
    String name;
    int id;

    Employee() {
        System.out.println("Default Constructor");
    }


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show() {
        System.out.println(id + " " + name);
    }
}

