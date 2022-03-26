package com.java8learn.functions;
// Java Program to demonstrate 

// Consumer's andThen() method 

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo2 {
	public static void main(String args[]) {

		// Consumer to multiply 2 to every integer of a list
		Consumer<List<Integer>> modify = list -> {
			for (int i = 0; i < list.size(); i++) {
				list.set(i, 2 * list.get(i));
			}
		};

		// Consumer to display a list of integers
		Consumer<List<Integer>> dispList = list -> list.stream().forEach(System.out::println);

		List<Integer> listOfIntegers = new ArrayList<Integer>();
		listOfIntegers.add(2);
		listOfIntegers.add(1);
		listOfIntegers.add(3);

		// using addThen()
		modify.andThen(dispList).accept(listOfIntegers);
	}
}
