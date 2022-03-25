package com.java8learn.functions;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.java8learn.utils.MyUtility;
import com.java8learn.utils.Person;

public class ForEachDemo {
	
	private static final Logger LOGGER = LogManager.getLogger(ForEachDemo.class);

	public static void main(String[] args) {
		//return List of persons where name starts with R
		List<Person> personList = MyUtility.getPersonList();
		
		List<Person> pListStartingWithR = personList.stream()
		.filter(p -> p.getFirstName().startsWith("R"))
		.collect(Collectors.toList());
		
		LOGGER.info("Orig List size = " + personList.size());
		LOGGER.info("pListStartingWithR List size = " + pListStartingWithR.size());
		
		pListStartingWithR.forEach(p -> System.out.println(p));
	}

}
