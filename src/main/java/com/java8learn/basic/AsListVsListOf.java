package com.java8learn.basic;

import java.util.Arrays;
import java.util.List;

public class AsListVsListOf {

	public static void main(String[] args) {
		System.out.println("Arrays.asList returns fixed size list but elements can be modified");
		asListDemo();
		
		System.out.println("List.of returns unmodifiable list");
		listOfDemo();
	}

	private static void listOfDemo() {
		List<Integer> numList = List.of(10,20,5,15,1,-90);

		/*
		 * Returns Unmodifiable Lists
		 */
		System.out.println("numList before modification: " + numList);
		
		/*
		 * numList is Unmodifiable Lists, you cannot modify elements in the list and cannot add new elements as its fixed size
		 */
		numList.set(2, 100);
		System.out.println("After changing element at index=2, bew numList : " + numList);
		
		/*
		 * Now if you try to add new element to the list
		 * Exception in thread "main" java.lang.UnsupportedOperationException
		 */
		//numList.add(90);
		System.out.println("Now if you try to add new element to the list: " + numList);
	
		
	}

	/**
	 * 
	 */
	private static void asListDemo() {
		/*
		 * Returns fixed size list
		 */
		List<Integer> numList = Arrays.asList(10,20,5,15,1,-90);
		System.out.println("numList before modification: " + numList);
		
		/*
		 * numList is mutableList, you can modify elements in the list but cannot add new elements as its fixed size
		 */
		numList.set(2, 100);
		System.out.println("After changing element at index=2, bew numList : " + numList);
		
		/*
		 * Now if you try to add new element to the list
		 * Exception in thread "main" java.lang.UnsupportedOperationException
		 */
	//	numList.add(90);
		System.out.println("Now if you try to add new element to the list: " + numList);
	}

}
