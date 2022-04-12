package com.springdi.Constructor_Injection_with_Dependent_Object;

public class Address {
	String City, State, Country;

	public Address(String city, String state, String country) {
		this.City = city;
		this.State = state;
		this.Country = country;
	}

	public void showAddress() {
		System.out.println("City: " + City);
		System.out.println("State: " + State);
		System.out.println("City: " + Country);
	}
}
