package com.java8learn.codingInterview.searching;
/**
 * Linear Search: Iterate through elements 1 at a time
 * runtime complexity : 0(n)
 * Disadvantage : Slow for large data set
 * Advantages : Fast for searches of small to medium data set. Doesn't need to be sorted. Useful for data structures that don't have random access
 * @author SamGrishma
 *
 */
public class LinearSearchExample {

	public static void main(String[] args) {
		//declare array
		int[] arr = new int[100];
		
		//initialize array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		// search if 84 present in given array
		int index = linearSearch(arr, 84);
		if (index==-1)
			System.out.println("Element Not Found!");
		else
			System.out.println("Element found at index="+index);
		
		// search if 136 present in given array
				int index2 = linearSearch(arr, 136);
				if (index2==-1)
					System.out.println("Element Not Found!");
				else
					System.out.println("Element found at index="+index2);
	}

	private static int linearSearch(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if(value == arr[i]) {
				return i;
			}
		}
		return -1; // index/element not found
	}

}
