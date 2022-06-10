package com.java8learn.codingInterview.arrays;

/*
 * 
* Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
		firstLast6([1, 2, 6]) => true
		firstLast6([6, 1, 2, 3]) => true
		firstLast6([13, 6, 1, 2, 3]) => false
 */
public class CheckIf6AppearsEitherAtFirstOrLastElementInArray {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 6};
		int[] arr2 = {6, 1, 2, 3};
		int[] arr3 = {13, 6, 1, 2, 3};
		
		boolean is6PresentInArray = checkElementInArray(arr1);
		System.out.println("firstLast6([1, 2, 6]) => true   :: "+ is6PresentInArray);
		
		is6PresentInArray = checkElementInArray(arr2);
		System.out.println("firstLast6([6, 1, 2, 3])  true :: "+ is6PresentInArray);
		
		is6PresentInArray = checkElementInArray(arr3);
		System.out.println("firstLast6([13, 6, 1, 2, 3])    false:: "+ is6PresentInArray);
	}

	private static boolean checkElementInArray(int[] arr) {
		if(arr[0]==6 || arr[arr.length-1]==6) {
			return true;
		}
		return false;
	}

}
