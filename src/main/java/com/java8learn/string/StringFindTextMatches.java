package com.java8learn.string;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Search the string for a particular sequence of character
 * </br>
 * {@link #StringPatternDemo}.{@link #main(String[])} for better performing solution for RegEx
 */
public class StringFindTextMatches {

	private static final Logger LOGGER = LogManager.getLogger(StringFindTextMatches.class);

	public static void main(String[] args) {
		String str = "Here is a long String…let's find a match!";
		String compareToStr1 = "Here is a long String…let's find a match!";
		String compareToStr2 = "Here is a long String";
		matches(str, compareToStr1); // prints true
		matches(str, compareToStr2); // prints false
		// prints true, this matches both True or true, returns true of match is found
		matches("true", "[Tt]rue");
		// prints true for both line 24 and 25
		// This will test for one or the other and when True/true or False/false match
		// is found then returns true
		matches("false", "[Tt]rue|[Ff]alse");
		matches("true", "[Tt]rue|[Ff]alse");
		// This will test if string matches any number [0-9] and [0-100] \\d{1,2}|100
		matches("I Love Java 8! and Java 11", "I Love Java [0-9]! and Java \\d{1,2}|100");

	}

	/**
	 * 
	 * @param str          Original String
	 * @param compareToStr Other string to compareTo
	 */
	private static void matches(String str, String compareToStr) {
		boolean matches = str.matches(compareToStr);
		LOGGER.info("Match Found = " + matches);
	}

}
