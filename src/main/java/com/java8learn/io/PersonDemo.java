package com.java8learn.io;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PersonDemo {
	
	
	private static final Logger LOGGER = LogManager.getLogger(PersonDemo.class);
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // InputStream used to read ip from console
		System.out.println("Enter Name:");
		String name = scanner.next(); // gets user ip value
		System.out.println("Enter Age:");
		int age = scanner.nextInt(); // gets user ip value
		System.out.println("Enter Phone Number:");
		long phoneNumber = scanner.nextLong(); // gets user ip value
		
		Person person = new Person(name, age, phoneNumber);
		LOGGER.debug(person);
	}

}
