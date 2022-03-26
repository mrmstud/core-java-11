package com.java8learn.functions;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo1 {
	public static void main(String args[]) {
		
		System.out.println("BinaryOperatorDemo1:");
		
		BinaryOperator<Integer> addTwoInt = (a,b) -> a+b;
		BinaryOperator<Integer> multiplyTwoInt = (a,b) -> a*b;
		System.out.println("addTwoInt.apply(10, 20): " + addTwoInt.apply(10, 20));
		System.out.println("multiplyTwoInt.apply(10, 20):" + multiplyTwoInt.apply(10, 20));		
		
		System.out.println("Returns a BinaryOperator which returns the greater of two elementsaccording to the specified Comparator:");
		BinaryOperator<Integer> binaryOperator = BinaryOperator.maxBy(Integer::compareTo);
		System.out.println("binaryOperator.apply(98, 11) : " + binaryOperator.apply(98, 11));
		System.out.println("binaryOperator.apply(11, 11) : " + binaryOperator.apply(11, 11));
		System.out.println("binaryOperator.apply(11, 98) : " + binaryOperator.apply(11, 98));
	}

}