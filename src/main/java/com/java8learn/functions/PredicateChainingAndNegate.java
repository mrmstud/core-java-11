package com.java8learn.functions;
// Java program to illustrate Predicate Chaining 

import java.util.function.Predicate; 
public class PredicateChainingAndNegate { 
	public static void main(String[] args) 
	{ 
		Predicate<Integer> greaterThanTen = (i) -> i > 10; 

		// Creating predicate 
		Predicate<Integer> lowerThanTwenty = (i) -> i < 20; 
		boolean result = greaterThanTen.and(lowerThanTwenty).test(15); 
		System.out.println("greaterThanTen.and(lowerThanTwenty).test(15) : " + result); 

		// Calling Predicate method and negate
		boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15); 
		System.out.println("greaterThanTen.and(lowerThanTwenty).negate().test(15) : " + result2); 
	} 
} 
