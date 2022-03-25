package com.java8learn.basic;

import java.util.Arrays;

public class UtilDemo {
	public static void main(String args[]) {
		int array[] = new int[10];
		for (int i = 0; i < 10; i++)
			array[i] = 5 * i;
		System.out.print("Original contents: ");
		display(array);
		
		Arrays.sort(array);
		System.out.print("Sorted: ");
		display(array);
		
		Arrays.fill(array, 2, 4, 3);
		System.out.print("After fill(): ");
		display(array);
		
		Arrays.sort(array);
		System.out.print("After sorting again: ");
		display(array);
		
		System.out.print("The value 25 is at location ");
		int index = Arrays.binarySearch(array, 25);
		System.out.println(index);

	}
	
	/**
	 * 
	 * @param array
	 */
	private static void display(int array[]) {
		for (int i : array)
			System.out.print(i + " ");
		System.out.println();
	}
}