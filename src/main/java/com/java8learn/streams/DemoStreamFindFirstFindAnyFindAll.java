package com.java8learn.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoStreamFindFirstFindAnyFindAll {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(10,5,20,15,70,-80,100,10,5);
		
		/*
		 * Returns whether all elements of this stream match the provided predicate.
		 */
		boolean doesAllElemMatch = numList.stream().allMatch(i->i%2==0);
		System.out.println("doesAllElemFromStreamMatch : " + doesAllElemMatch);
		
		Optional<Integer> findAnyNum = numList.stream().findAny();
		System.out.println("findAnyFromStream: " + findAnyNum.orElse(999999));
		System.out.println("findAnyFromStream: " + new ArrayList<>().stream().findAny().orElse(9999));
	}

}
