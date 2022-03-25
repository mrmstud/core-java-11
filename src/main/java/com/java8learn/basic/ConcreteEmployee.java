package com.java8learn.basic;

import lombok.extern.log4j.Log4j2;

@Log4j2
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
		log.info("I am employee wirh name : " +name);
		
	}

	@Override
	public void setPersonType(String type) {
		log.info("I am person of type : " + type);
	}

	@Override
	public String toString() {
		return "ConcreteEmployee [personType=" + personType + ", getFname()=" + getFname() + ", getLname()="
				+ getLname() + ", getAge()=" + getAge() + "]";
	}
	
	
	

}
