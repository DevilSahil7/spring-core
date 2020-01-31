package com.spring.demo.autowireing.bytype;

public class Employee {

	private int id;
	
	private String name;
	
	private Address address;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Id id "+id+"\nName id "+name+"\nAddress is "+address.toString());
	}
}
