package com.java8learn.codingInterview.arrays;

/**
 * Given an array of ints, return true if the array is length 1 or more, and the
 * first element and the last element are equal. 
 * sameFirstLast([1, 2, 3]) ==>  false 
 * sameFirstLast([1, 2, 3, 1]) ==> true 
 * sameFirstLast([1, 2, 1]) ==> true
 * 
 * @author SamGrishma
 *
 */
public class ArrayLengthExample {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3, 1 };
		int[] arr3 = { 1, 2, 1 };

		boolean isSameFirstLast = sameFirstLast(arr1);
		System.out.println("sameFirstLast([1, 2, 3]) ==> false  :: " + isSameFirstLast);

		isSameFirstLast = sameFirstLast(arr2);
		System.out.println("sameFirstLast([1, 2, 3, 1]) ==> true  :: " + isSameFirstLast);

		isSameFirstLast = sameFirstLast(arr3);
		System.out.println("sameFirstLast([1, 2, 1]) ==> true  :: " + isSameFirstLast);
	}

	private static boolean sameFirstLast(int[] nums) {
		if( (nums.length >= 1) && (nums[0] == nums[nums.length - 1])) {
				return true;
			}
		return false;
	}

}
