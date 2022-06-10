package com.java8learn.codingInterview.arrays;

public class ReverseTheElementsInArray {

	public static void main(String[] args) {
		System.out.println(" reverse3(new int[]{1,2,3,1,2,3}) :: " + printArray(reverse3(new int[]{1,2,3,1,2,3})));
		
		System.out.println(" reverse3(new int[]{5,11,8,7}) :: " + printArray(reverse3(new int[]{5,11,8,7})));
		
		System.out.println(" reverse3(new int[]{7,0,0}) :: " + printArray(reverse3(new int[]{7,0,0})));
	}
	
	private static String printArray(int[] arr) {
		StringBuilder op = new StringBuilder();
		op.append("{");
		for (int i = 0; i < arr.length; i++) {
			op.append(arr[i]);
			if(i<arr.length-1) {
				op.append(",");
			}
		}
		op.append("}");
		return op.toString();
	}

	private static int[] reverse3(int[] nums) {
		  for(int i=0; i < nums.length; i++) {
		    for(int j=i+1; j< nums.length; j++) {
		      int temp = 0;
		      temp = nums[i];
		      nums[i] = nums[j];
		      nums[j] = temp;
		    }
		  }
		  return nums;
		}

}
