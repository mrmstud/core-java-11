package com.java8learn.basic;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AbsractDemo {

	public static void main(String[] args) {
		ConcreteEmployee cEmployee = new ConcreteEmployee("Employee", "FirstName", "LastName", 56);
		log.info("employee details : " + cEmployee);
		

		ConcreteCustomer customer = new ConcreteCustomer("Customer", "CFname", "CLname", 26);
		log.info("employee details : " + customer);
		
		cEmployee.sayHello();
		
		customer.sayHello();
	
	}
}
