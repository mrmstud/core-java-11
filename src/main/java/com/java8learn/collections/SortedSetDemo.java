package com.java8learn.collections;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

import com.java8learn.utils.Person;

public class SortedSetDemo {

	public static void main(String[] args) {
		Set<String> ts = new TreeSet<String>();
		// Adding elements into the TreeSet
        // using add()
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");
        
        printSet(ts);
        
        // Adding the duplicate element
        boolean isAdded = ts.add("India");
        System.out.println("Adding the duplicate element \"India\", is it added? " + isAdded);
        
        // Removing items from TreeSet using remove()
        ts.remove("Australia");
        System.out.println("Set after removing  Australia:" + ts);
        
        
        
	}
	
	/**
	 * @param personSet
	 */
	private static void printSet(Collection<String> persons) {
		persons.stream().forEach(System.out::println);
	}

}
