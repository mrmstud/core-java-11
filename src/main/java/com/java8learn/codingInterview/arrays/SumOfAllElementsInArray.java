package com.java8learn.codingInterview.arrays;

public class SumOfAllElementsInArray {

	public static void main(String[] args) {
		int[] arr1 = {7,0,0};
		int[] arr2 = new int[] {5,11,2};
		System.out.println("Sum of  {7,0,0} :: " + sumOfElementsInArray(arr1));
		System.out.println("Sum of  {5,11,2} :: " + sumOfElementsInArray(arr2));
	}

	private static int sumOfElementsInArray(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

}
