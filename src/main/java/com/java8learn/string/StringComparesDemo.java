package com.java8learn.string;

public class StringComparesDemo {

	public static void main(String[] args) {
		/* Get Potion of string */
		String originalString = "This is the original String";
		System.out.println(originalString.substring(11, 20));
		System.out.println(originalString.substring(11, 20));

		String one = "one";
		String two = "two";

		String var1 = "one";
		String var2 = "Two";

		String pieceone = "o";
		String piecetwo = "ne";

		// Comparison is equal
		if (one.equals(var1)) {
			System.out.println("String one equals var1 using equals");
		}

		// Comparison is NOT equal
		if (one.equals(two)) {
			System.out.println("String one equals two using equals");
		}

		// Comparison is NOT equal
		if (two.equals(var2)) {
			System.out.println("String two equals var2 using equals");
		}

		// Comparison is equal, but is not directly comparing string values using ==
		if (one == var1) {
			System.out.println("String one equals var1 using ==");
		}

		// Comparison is equal
		if (two.equalsIgnoreCase(var2)) {
			System.out.println("String two equals var2 using equalsIgnoreCase");
		}

		System.out.println("Trying to use == on Strings that are pieced together");

		String piecedTogether = pieceone + piecetwo;

		// Comparison is equal
		if (one.equals(piecedTogether)) {
			System.out.println("The strings contain the same value using equals");
		}

		// Comparison is NOT equal using ==
		if (one == piecedTogether) {
			System.out.println("The string contain the same value using == ");
		}

		// Comparison is equal
		if (one.compareTo(var1) == 0) {
			System.out.println("One is equal to var1 using compareTo()");
		}

	}

}
