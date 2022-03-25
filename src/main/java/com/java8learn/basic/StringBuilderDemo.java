package com.java8learn.basic;

/*
 * StringBUilder is not ThreadSafe and it is mutable
 * Text modification with StrinBuilder reduces the no. of String objects you need to create             
 */
public class StringBuilderDemo {

	public static void main(String[] args) {
		// append, insert, delete, reverse
		StringBuilder sBuilder = new StringBuilder();// Default capacity is 16
		System.out.println("Default capacity for StringBuilder : " + sBuilder.capacity());

		sBuilder.append("Hello, ");
		System.out.println("StringBuilder length : " + sBuilder.length());

		sBuilder.append("I am awake now.");
		sBuilder.append("It's time to go to Gym.");
		System.out.println("Convert StringBuilder to String : " + sBuilder.toString());
		/*
		 * The java.lang.StringBuilder.insert(int offset, char c) method inserts the
		 * string representation of the char argument into this sequence.
		 * 
		 * The second argument is inserted into the contents of this sequence at the
		 * position indicated by offset. The length of this sequence increases by
		 * one.The offset argument must be greater than or equal to 0, and less than or
		 * equal to the length of this sequence.
		 */
		sBuilder.insert(7, "Mahesh.");
		System.out.println("After insert : " + sBuilder.toString());
		/*
		 * The delete(int start, int end) method of StringBuilder class removes the
		 * characters starting from index start to index end-1 from String contained by
		 * StringBuilder. This method takes two indexs as a parameter first start
		 * represents index of the first character and endIndex represents index after
		 * the last character of the substring to be removed from String contained by
		 * StringBuilder and returns the remaining String as StringBuilder Object.
		 * 
		 * Syntax:
		 * 
		 * public StringBuilder delete(int start, int end) Parameters: This method
		 * accepts two parameters:
		 * 
		 * start: index of the first character of the substring. end: index after the
		 * last character of the substring. Return Value: This method returns this
		 * StringBuilder object after removing the substring.
		 * 
		 * Exception: This method throws StringIndexOutOfBoundsException if the start is
		 * less than zero, or start is larger than the length of String, or start is
		 * larger than end.
		 */
		sBuilder.delete(0, 7); // deletes 'Hello, ' from "Hello, Mahesh.I am awake now.It's time to go to Gym."
		System.out.println("After delete : " + sBuilder.toString());

	}

}
