package com.java8learn.basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 *
 * This abstract class has private, default, protected, public methods but no abstract method.
 *
 */

@Log4j2
public class AbstarctClassWithoutAbstarctMethod extends Address{

	public static void main(String[] args) {
		
		log.info("AbstarctClassWithoutAbstarctMethod example:");
		
		Address address = new AbstarctClassWithoutAbstarctMethod();
		address.setCity("Akola");
		address.setState("MH");
		address.setStreet("Gorakshan Road");
		
		log.info("Address is:" + address);
		
		// private method of parent class cannot be accessed in child class
		//address.privateMethod(); // compilation error
		address.protectedMethod();
		address.defaultMethod();
		address.publicMethod();
		
		log.info("AbstarctClassWithoutAbstarctMethod demo DONE:");
	}

}

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
abstract class Address {
	private String street;
	private String city;
	private String state;
	
	/*
	 * This abstract class has private, default, protected, public methods but no abstract method.
	 */
	
	private void privateMethod() {
		log.info("AbstarctClassWithoutAbstarctMethod, privateMethod");
	}
	
	void defaultMethod()  {
		log.info("AbstarctClassWithoutAbstarctMethod, defaultMethod");
	}
	
	protected void protectedMethod() {
		log.info("AbstarctClassWithoutAbstarctMethod, protectedMethod");
	}
	
	public void publicMethod() {
		log.info("AbstarctClassWithoutAbstarctMethod, publicMethod");
	}
}
