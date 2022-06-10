package com.java8learn.codingInterview.searching;
/**
 * Binary Search: searches an target element within sorted array. Half of the array is eliminated in each step. Extremely good in large data set.
 * Time Complexity : O (log n) .... larger the data set, better the performance
 * @author SamGrishma
 *
 */
public class BinarySearchExample {

	public static void main(String[] args) {
		// declare array
		int[] arr = new int[100];

		// initialize array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		// search if 84 present in given array
		int index = binarySearch(arr, 84);
		if (index == -1)
			System.out.println("Element Not Found!");
		else
			System.out.println("Element found at index=" + index);

	}

	private static int binarySearch(int[] arr, int value) {
		
		
		
		return -1;
	}

}
