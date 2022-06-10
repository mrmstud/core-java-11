package com.java8learn.codingInterview.arrays;
/**
 * 
Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.


commonEnd([1, 2, 3], [7, 3]) ==> true
commonEnd([1, 2, 3], [7, 3, 2]) ==> false
commonEnd([1, 2, 3], [1, 3]) ==> true
 * @author SamGrishma
 *
 */
public class CompareElementsInTwoArraysByPosition {

	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2,3};
		int[] arr2 = new int[] {7,3};
		System.out.println("commonEnd([1, 2, 3], [7, 3]) ==> true  :: " + commonEnd(arr1, arr2)); // true
		
		int[] arr3 = new int[] {1,2,3};
		int[] arr4 = new int[] {7,3,2};
		System.out.println("commonEnd([1, 2, 3], [7, 3, 2]) ==> false  :: " + commonEnd(arr3, arr4)); // false
		
		
		int[] arr5 = new int[] {1,2,3};
		int[] arr6 = new int[] {1,3};
		System.out.println("commonEnd([1, 2, 3], [1, 3]) ==> true  :: " + commonEnd(arr5, arr6)); // true
	}
	
	private static boolean commonEnd(int[] a, int[] b) {
		  return((a[a.length-1]==b[b.length-1]) || (a[0]==b[0]));
		}


}
