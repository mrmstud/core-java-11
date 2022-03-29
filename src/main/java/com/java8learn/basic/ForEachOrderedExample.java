package com.java8learn.basic;

import java.util.Set;
import java.util.TreeSet;

public class ForEachOrderedExample {
	public static void main(final String[] args) {
		// sorted set lexicographically, if ArrayList then insertion order
		final Set<String> gameSet = new TreeSet<>(); 
		gameSet.add("Chess");
		gameSet.add("Football");
		gameSet.add("Cricket");
		gameSet.add("Hocky");
		gameSet.add("Vollyball");
		gameSet.add("Ludo");
		gameSet.add("Baseball");
		
		System.out.println("------------Iterating by passing lambda expression---------------");
		gameSet.stream().forEachOrdered(games -> System.out.println(games));
		
		System.out.println("------------Iterating by passing method reference---------------");
		gameSet.stream().forEachOrdered(System.out::println);
	}

}