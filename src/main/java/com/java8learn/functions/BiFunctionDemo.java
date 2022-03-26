package com.java8learn.functions;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> add = (a,b)->a+b;
		BiFunction<Integer, Integer, Integer> substract = (a,b)->(a>b)? a-b: b-a;
		BiFunction<Integer, Integer, Integer> multiply = (a,b)->a*b;
		BiFunction<Integer, Integer, Double> divide = (a,b)->(b>0)?a/b:-1.0; // -1.0 indicates division error
		
		System.out.println("processbersForAddition(10,20, add) : " + processTwoNumbers(10,20, add));
		System.out.println("processbersForSubstraction(10,20, substract) : " + processTwoNumbers(10,20, substract));
		System.out.println("processbersForMultiplication(10,20, multiply) : " + processTwoNumbers(10,20, multiply));
		System.out.println("processbersForDivision(100,20, divide) : " + processDivide(100,20, divide));
	}

	private static Double processDivide(int i, int j, BiFunction<Integer, Integer, Double> biFun) {
		return biFun.apply(i, j);
	}

	private static Integer processTwoNumbers(int i, int j, BiFunction<Integer, Integer, Integer> biFun) {
		return biFun.apply(i, j);
	}

}
