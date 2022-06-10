package com.java8learn.codingInterview.arrays;

public class RotateArrayElementsToLeftBy1Position {

	public static void main(String[] args) {
		int[] nums = new int[] {5, 11, 9};
		System.out.println("rotateLeft3(new int[] {5, 11, 9}) :: "+printArray(rotateLeft3(nums)));
		
		int[] nums2 = new int[] {1,2,3};
		System.out.println("rotateLeft3(new int[] {1,2,3}) :: "+printArray(rotateLeft3(nums2)));
		
		int[] nums3 = new int[] {7,0,0};
		System.out.println("rotateLeft3(new int[] {7,0,0}) :: "+printArray(rotateLeft3(nums3)));
		
	

	}

	/**
	 * Utility method to return arr of ints as string {e1,e2,e3, etc}
	 * @param arr
	 * @return
	 */
	private static String printArray(int[] arr) {
		StringBuilder op = new StringBuilder();
		op.append("{");
		for (int i = 0; i < arr.length; i++) {
			op.append(arr[i]);
			if ((i<arr.length-1)) {
				op.append(",");
			}
		}
		op.append("}");
		return op.toString();
	}

	private static int[] rotateLeft3(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			int temp = 0;
			temp = nums[i];
			nums[i] = nums[i + 1];
			nums[i + 1] = temp;
		}
		return nums;
	}

}
