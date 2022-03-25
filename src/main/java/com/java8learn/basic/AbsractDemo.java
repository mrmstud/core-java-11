package com.java8learn.basic;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AbsractDemo {

	public static void main(String[] args) {
		ConcreteEmployee cEmployee = ConcreteEmployee.builder()
											.fname("E-Fname")
											.personType("Employee")
											.age(56)
											.lname("E-Lname")
											.build();
		log.info("employee details : " + cEmployee);

		ConcreteCustomer customer = ConcreteCustomer.builder()
										.age(26)
										.fname("C-Fname")
										.lname("C-Lname")
										.personType("Customer")
										.build();
		log.info("employee details : " + customer);

		cEmployee.sayHello();

		customer.sayHello();

	}
}
