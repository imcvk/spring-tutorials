package com.springdi.dependency_injection_using_setter;

public class Employee {
    String name;
    String id;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

public void show(){
    System.out.println("Employee name: "+name);
    System.out.println("Employee ID: "+id);
}

}
