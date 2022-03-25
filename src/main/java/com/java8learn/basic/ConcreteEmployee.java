package com.java8learn.basic;

public class ConcreteEmployee extends AbstractPerson {
	String personType;
	String fname;
	
	public ConcreteEmployee() {
		super();
	}
	
	public ConcreteEmployee(String personType, String fname, String lname, int age) {
		super(fname, lname, age);
		this.personType = personType;
		
	}

	@Override
	public void sayHello() {
		String name = getFname()+" " + getLname(); // accessing superclass methods
		System.out.println("I am employee wirh name : " +name);
		
	}

	@Override
	public void setPersonType(String type) {
		System.out.println("I am person of type : " + type);
	}

	@Override
	public String toString() {
		return "ConcreteEmployee [personType=" + personType + ", getFname()=" + getFname() + ", getLname()="
				+ getLname() + ", getAge()=" + getAge() + "]";
	}
	
	
	

}
