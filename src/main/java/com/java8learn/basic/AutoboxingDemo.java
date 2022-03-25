package com.java8learn.basic;

import java.text.MessageFormat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Consider the following method, which calculates the sum of all the positive int values. To do this, the
program has to use long arithmetic because an int is not big enough to hold the
sum of all the positive int values:
 */
public class AutoboxingDemo {
	
	private static final Logger LOGGER = LogManager.getLogger(AutoboxingDemo.class);
	// Hideously slow! Can you spot the object creation?
	private static long sum() {
		/*
		 * This program gets the right answer, but it is much slower than it should be,
		 * due to a one-character typographical error. The variable sum is declared as a
		 * Long instead of a long, which means that the program constructs about 231
		 * unnecessary Long instances
		 */
		Long sum = 0L;
		for (long i = 0; i <= Integer.MAX_VALUE; i++)
			sum += i;
		return sum;
	}   
	
	// Improved performance by avoiding autoboxing
	private static long sumImproved() {
		/*
		 * This program gets the right answer, but it is much slower than it should be,
		 * due to a one-character typographical error. The variable sum is declared as a
		 * Long instead of a long, which means that the program constructs about 231
		 * unnecessary Long instances
		 */
		long sum = 0L;
		for (long i = 0; i <= Integer.MAX_VALUE; i++)
			sum += i;
		return sum;
	} 
	
	// All Boxed Premitive
		private static Long sumWithAllBoxedPremitives() {
			/*
			 * This program gets the right answer, but it is much slower than it should be,
			 * due to a one-character typographical error. The variable sum is declared as a
			 * Long instead of a long, which means that the program constructs about 231
			 * unnecessary Long instances
			 */
			Long sum = 0L;
			for (Long i = 0L; i <= Integer.MAX_VALUE; i++)
				sum += i;
			return sum;
		} 
	
	public static void main(String[] args) {
		testSumTakingLongTimeDueToAutoBoxing(); // took Total Execution Time = 9,214
		testImprovedSumWithoutAutoBoxing();		// took Total Execution Time = 1,522
		testSumWithAllBoxedPremitives();        // took Total Execution Time = 9,200
		
		// The lesson is clear: prefer primitives to boxed primitives, and watch out for unintentional autoboxing.
	}

	private static void testSumWithAllBoxedPremitives() {
		long startTime = System.currentTimeMillis();
		LOGGER.info(MessageFormat.format("SumWithAllBoxedPremitives Start time in ms = {0}", startTime));
		// call to slow sum
		long sum = sum();
		LOGGER.info(MessageFormat.format("SumWithAllBoxedPremitives Sum of all int = {0}", sum));
		long endTime = System.currentTimeMillis();
		LOGGER.info(MessageFormat.format("SumWithAllBoxedPremitives End time in ms = {0}", endTime));
		
		LOGGER.info(MessageFormat.format("SumWithAllBoxedPremitives Total Execution Time = {0}", endTime-startTime));
	}

	/**
	 * test Sum method Taking Long Time Due To AutoBoxing
	 */
	private static void testSumTakingLongTimeDueToAutoBoxing() {
		long startTime = System.currentTimeMillis();
		LOGGER.info(MessageFormat.format("Start time in ms = {0}", startTime));
		// call to slow sum
		long sum = sum();
		LOGGER.info(MessageFormat.format("Sum of all int = {0}", sum));
		long endTime = System.currentTimeMillis();
		LOGGER.info(MessageFormat.format("End time in ms = {0}", endTime));
		
		LOGGER.info(MessageFormat.format("Total Execution Time = {0}", endTime-startTime));
	}
	
	/**
	 * test Sum method Taking Long Time Due To AutoBoxing
	 */
	private static void testImprovedSumWithoutAutoBoxing() {
		long startTime = System.currentTimeMillis();
		LOGGER.info(MessageFormat.format("sumImproved Start time in ms = {0}", startTime));
		// call to slow sum
		long sum = sumImproved();
		LOGGER.info(MessageFormat.format("sumImproved Sum of all int = {0}", sum));
		long endTime = System.currentTimeMillis();
		LOGGER.info(MessageFormat.format("sumImproved End time in ms = {0}", endTime));
		
		LOGGER.info(MessageFormat.format("sumImproved Total Execution Time = {0}", endTime-startTime));
	}
}
