package com.java8learn.collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.java8learn.utils.MyUtility;
import com.java8learn.utils.Person;

public class SortedSet {

	public static void main(String[] args) {
		//Get list of employees
		List<Person> personList = MyUtility.getPersonList();
		System.out.println("Employee List Size = " + personList.size());
		
		//Convert list to set
		//Set<Person> personSet = new TreeSet<>(personList); // bu using comparable<person> ..orderby PersonId
		Set<Person> personSet = new TreeSet<>(Comparator.comparing(Person::getFirstName)); // orderByFirstname
		personSet.addAll(personList);
		//personSet.addAll(personList);
		System.out.println("Employee set size : "+ personSet.size());
		
		//Iterate over set
		System.out.println("Printing set of employee:");
		printSet(personSet);
		
		//remove elements from the set
		Person p = Person.getPersonById((long) 160);
		boolean isRemoved = personSet.remove(p);
		System.out.println("is person with id : " + 160 + " removed ?" + isRemoved);
		System.out.println("Employee set size after remove : "+ personSet.size());
		printSet(personSet);
		
	}

	/**
	 * @param personSet
	 */
	private static void printSet(Collection<Person> persons) {
		persons.stream().forEach(System.out::println);
	}

}
