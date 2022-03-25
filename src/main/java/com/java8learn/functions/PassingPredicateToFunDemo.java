package com.java8learn.functions;
// Java program to illustrate passing Predicate into function 

import java.util.function.Predicate;

public class PassingPredicateToFunDemo {

	public static void pred(int number, Predicate<Integer> predicate) {
		if (predicate.test(number)) {
			System.out.println("TRUE : Number " + number);
		} else {
			System.out.println("FALSE : Number " + number);
		}
	}

	public static void main(String[] args) {
		Predicate<Integer> lessThan10Predicate = (i) -> i < 10;
		pred(8, lessThan10Predicate); // number and predicate is passed
		pred(12, lessThan10Predicate); // number and predicate is passed

		Predicate<Integer> evenOddPredicate = (i) -> {
			return (i >= 0 && i % 2 == 0);
		};
		pred(12, evenOddPredicate);
		pred(11, evenOddPredicate);
		pred(9, evenOddPredicate);
		pred(-10, evenOddPredicate);
		pred(-5, evenOddPredicate);
		pred(0, evenOddPredicate);
		pred(1, evenOddPredicate);
		/*
		 * TRUE : Number 8 
		 * FALSE : Number 12 
		 * TRUE : Number 12 
		 * FALSE : Number 11 
		 * FALSE : Number 9 
		 * FALSE : Number -10 
		 * FALSE : Number -5 
		 * TRUE : Number 0 
		 * FALSE : Number 1
		 * 
		 */
	}
}
