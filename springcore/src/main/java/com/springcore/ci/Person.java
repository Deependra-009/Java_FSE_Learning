package com.springcore.ci;

public class Person {
	
	private String name;
	private int id;
	private Certificate cert;
	public Person(String name, int id, Certificate cert) {
		super();
		this.name = name;
		this.id = id;
		this.cert = cert;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", cert=" + cert + "]";
	}
	
	
	
	

}
