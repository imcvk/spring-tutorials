package com.springdi.Constructor_Injection_with_Dependent_Object;

public class Employee {
	Address address;
	String name;
	int empid;

	public Employee() {
		System.out.println("Default constructor for Employee...");
	}

	public Employee(Address address, String name, int empid) {
		super();
		this.address = address;
		this.name = name;
		this.empid = empid;
	}

	public void showEmpDetails() {
		System.out.println("Name: " + name);
		System.out.println("Employee id:" + empid);
		System.out.println("Address: " + address.City+","+address.State+","+address.Country);

	}
}
