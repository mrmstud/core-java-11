package com.java8learn.basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import lombok.extern.log4j.Log4j2;

@Log4j2
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class ConcreteCustomer extends AbstractPerson {
	String personType;
	String fname;

	@Override
	public void sayHello() {
		String name = getFname() + " " + getLname(); // accessing superclass methods
		log.info("I am customer wirh name : " + name);

	}

	@Override
	public void setPersonType(String type) {
		log.info("I am person of type : " + type);
	}
}
