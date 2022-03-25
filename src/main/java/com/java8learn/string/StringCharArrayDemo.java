package com.java8learn.string;

/**
 * You want to iterate over the characters in a string of text so that you can
 * manipulate them at the character level.
 *
 */
public class StringCharArrayDemo {

	public static void main(String[] args) {
		/*
		 * Use a combination of string helper methods to gain access to the string at a
		 * character level. If you use a String helper method within the context of a
		 * loop, you can easily traverse a string by character. In the following
		 * example, the string named str is broken down using the toCharArray() method.
		 */
		String str = "Break down into chars";
		System.out.println(str);
		
		for (char chr : str.toCharArray()) {
			System.out.print(chr + ",");
		}
		
		
		System.out.println("\nUsing charAt() method: \n");
		
		
		for (int x = 0; x <= str.length() - 1; x++) {
			System.out.print(str.charAt(x) + ",");
		}
	}

}
