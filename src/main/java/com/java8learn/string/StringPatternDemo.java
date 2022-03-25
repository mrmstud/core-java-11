package com.java8learn.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Pattern and Matcher classes for matching RegEx for String is
 * better-performing soln.
 *
 */
public class StringPatternDemo {
	
	private static final Logger LOGGER = LogManager.getLogger(StringPatternDemo.class);

	public static void main(String[] args) {
		String origStr = "I love Java 8!";
		// Step 1: Compile the pattern into Pattern obj
		Pattern anyNumPatternBetwn0To9 = Pattern.compile("I love Java [0-9]!");
		// Step 2: Construct a Matcher object from pattern obj
		Matcher matcher = anyNumPatternBetwn0To9.matcher(origStr);
		// Step 3: Call the matches method on matcher obj
		boolean matches = matcher.matches();
		LOGGER.info("Match Found : " + matches);
	}
}