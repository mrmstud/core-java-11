package com.java8learn.basic;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConcreteCustomer extends AbstractPerson {
	String personType;
	
	public ConcreteCustomer() {
		super();
	}
	
	public ConcreteCustomer(String personType, String fname, String lname, int age) {
		super(fname, lname, age);
		this.personType = personType;
		
	}

	@Override
	public void sayHello() {
		String name = getFname()+" " + getLname(); // accessing superclass methods
		log.info("I am customer wirh name : " +name);
		
	}

	@Override
	public void setPersonType(String type) {
		log.info("I am person of type : " + type);
	}

	public String getPersonType() {
		return personType;
	}

	@Override
	public String toString() {
		return "ConcreteCustomer [getPersonType()=" + getPersonType() + ", getFname()=" + getFname() + ", getLname()="
				+ getLname() + ", getAge()=" + getAge() + "]";
	}
	
	

}
