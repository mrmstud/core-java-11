package com.java8learn.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoAvgOfSuaresOfIntArray {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		for (int i = 0; i < 11; i++) {
			intList.add(i);
		}
		Double avgSuaresOfIntArray = demoAvgOfSuaresOfIntArray(intList);
		System.out.println(avgSuaresOfIntArray);
		
		System.out.println("demoAvgOfSuaresOfIntArrayImproved:");
		demoAvgOfSuaresOfIntArrayImproved(intList);

	}

	private static Double demoAvgOfSuaresOfIntArrayImproved(List<Integer> intList) {
		return intList.stream()
				.map(i->i*i)
			.collect(Collectors.averagingDouble(i->i));
	}

	private static Double demoAvgOfSuaresOfIntArray(List<Integer> intList) {
		List<Integer> intSquareList = intList.stream()
			.map(i->i*i)
			.collect(Collectors.toList());
		
		System.out.println("Printing Orig List:");
		intList.forEach(System.out::println);
		
		System.out.println("Printing Square List:");
		intSquareList.forEach(System.out::println);
		
		System.out.println("Printing avg of squares of int list:");
		Double avgOfSquaresOfIntList = intSquareList.stream().collect(Collectors.averagingDouble(i->i));
		return avgOfSquaresOfIntList;
	}

}
