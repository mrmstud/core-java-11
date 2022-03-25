package com.java8learn.functions;
// Java program to illustrate Simple Predicate 

import java.util.function.Predicate; 
public class PredicateInterfaceExample1 { 
	public static void main(String[] args) 
	{ 
		// Creating predicate 
		Predicate<Integer> lessThanTwenty = i -> (i < 20); 

		// Calling Predicate method 
		System.out.println(lessThanTwenty.test(25)); 
	} 
} 
