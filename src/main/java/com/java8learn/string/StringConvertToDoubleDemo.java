package com.java8learn.string;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Demonstrates String conversion to/from Double
 *
 */
public class StringConvertToDoubleDemo {

	/**
	 * Static field to hold org.apache.logging.log4j.Logger instance
	 */
	private static final Logger LOGGER = LogManager.getLogger(StringConvertToDoubleDemo.class);

	/**
	 * Main method to test conversion logic The listing shows conversion from a
	 * string to a double-precision floating-point value, and shows two methods for
	 * getting back to a string again.
	 * 
	 * @param args Array of Strings passed as arg to main method
	 */
	public static void main(String[] args) {
		String strDouble = "10.50"; // String representation of double
		Double d = convertStringToDouble(strDouble);
		LOGGER.info("3 time of Double Value = " + d + " is : " + (3 * d)); // prints 31.5

		String s = convertToString(d); // d is double and val=10.5
		// since s is string s+s = 10.510.5 instead of 21.0
		LOGGER.info("addition of string double " + s + s + " is : " + s + s);

	}

	/**
	 * Converts from Double to String
	 * 
	 * @param d takes parameter of type Double
	 * @return String value of passed Double
	 */
	private static String convertToString(Double d) {
		return String.valueOf(d);
	}

	/**
	 * Converts from Double to String
	 * 
	 * @param d takes parameter of type Double
	 * @return String value of passed Double
	 */
	private static Double convertStringToDouble(String strDouble) {
		return Double.parseDouble(strDouble);
	}

}
