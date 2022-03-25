package com.java8learn.io;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Person {
	
	
	private static final Logger LOGGER = LogManager.getLogger(Person.class);

	private String name;
	private int age;
	private long phoneNumber;

	public Person() {
		super();
	}

	public Person(String name, int age, long phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		LOGGER.debug("Person Created : ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}

}
