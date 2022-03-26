package com.java8learn.functions;

import java.util.function.Predicate;

public class PredicateChaningExample {

	public static void main(String[] args) {
		Predicate<Integer> greaterThan20 = (num) -> num>=20;
		Predicate<Integer> lessThan30 = (num) -> num<=30;
		Predicate<Integer> isPrime = (num)->isOdd(num);
		
		// Now method chaining of predicates to check
		// if given num is between 20 and 30 and if it's odd
		System.out.println("Check if given number is odd and is between 20 and 30, both inclusive.");
		for(int i=17; i<=33; i++) {
			System.out.println("Given Number: " + i + " and result is : " + greaterThan20.and(lessThan30).and(isPrime).test(i));
		}
		
		System.out.println("Done!");
	}

	private static boolean isOdd(Integer num) {
		return num%2!=0;
	}

}
