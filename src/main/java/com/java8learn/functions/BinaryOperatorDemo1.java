package com.java8learn.functions;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo1 {
	public static void main(String args[]) {
		BinaryOperator<Integer> binaryOperator = BinaryOperator
				.maxBy((Integer num1, Integer num2) -> num1.compareTo(num2));

		System.out.println("binaryOperator.apply(98, 11) : " + binaryOperator.apply(98, 11));
		System.out.println("binaryOperator.apply(11, 11) : " + binaryOperator.apply(11, 11));
		System.out.println("binaryOperator.apply(11, 98) : " + binaryOperator.apply(11, 98));
	}
}
