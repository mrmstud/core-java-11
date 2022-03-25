package com.java8learn.basic;

public class AbsractDemo {

	public static void main(String[] args) {
		ConcreteEmployee cEmployee = new ConcreteEmployee("Employee", "FirstName", "LastName", 56);
		System.out.println("employee details : " + cEmployee);
		

		ConcreteCustomer customer = new ConcreteCustomer("Customer", "CFname", "CLname", 26);
		System.out.println("employee details : " + customer);
		
		cEmployee.sayHello();
		
		customer.sayHello();
	
	}
}
