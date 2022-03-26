package com.java8learn.functions;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo1 {
	public static void main(String args[]) {
		
		System.out.println("BinaryOperatorDemo1:");
		
		BinaryOperator<Integer> addTwoInt = (a,b) -> a+b;
		BinaryOperator<Integer> multiplyTwoInt = (a,b) -> a*b;
		System.out.println("addTwoInt.apply(10, 20): " + addTwoInt.apply(10, 20));
		System.out.println("multiplyTwoInt.apply(10, 20):" + multiplyTwoInt.apply(10, 20));		
		
		System.out.println("Returns a BinaryOperator which returns the greater of two elements according to the specified Comparator:");
		BinaryOperator<Integer> binaryOperatorMaxBy = BinaryOperator.maxBy(Integer::compareTo);
		System.out.println("binaryOperatorMaxBy.apply(98, 11) : " + binaryOperatorMaxBy.apply(98, 11));
		System.out.println("binaryOperatorMaxBy.apply(11, 11) : " + binaryOperatorMaxBy.apply(11, 11));
		
		System.out.println("Returns a BinaryOperator which returns the lesser of two elements according to the specified Comparator.");
		BinaryOperator<Integer> binaryOperatorMinBy = BinaryOperator.minBy(Integer::compareTo);
		System.out.println("binaryOperatorMinBy.apply(11, 98) : " + binaryOperatorMinBy.apply(11, 98));
	}

}