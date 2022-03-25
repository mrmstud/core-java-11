package com.java8learn.numbersAndDates;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * To round floating-point numbers or doubles in your
 * application to Integer values.
 * 
 * @author mahallem
 *
 */
public class DemoRoundFloatAndLong {

	private static final Logger LOGGER = LogManager.getLogger(DemoRoundFloatAndLong.class);

	public static void main(String[] args) {
		float myFloat = 10.4497f;
		double myDouble = 10.4497d;
		int floatToInt = roundFloatToInt(myFloat); // prints roundFloatToInt = 10
		long doubleToLong = roundDoubleToLong(myDouble); // roundDoubleToLong = 10

		LOGGER.info("myFloat = " + myFloat + " and roundFloatToInt = " + floatToInt);
		LOGGER.info("myDouble = " + myDouble + " and roundDoubleToLong = " + doubleToLong);
		
		myFloat = 10.889f;
		myDouble = 10.889d;
		
		floatToInt = roundFloatToInt(myFloat); // prints roundFloatToInt = 11
		doubleToLong = roundDoubleToLong(myDouble); // roundDoubleToLong = 11

		LOGGER.info("myFloat = " + myFloat + " and roundFloatToInt = " + floatToInt);
		LOGGER.info("myDouble = " + myDouble + " and roundDoubleToLong = " + doubleToLong);
		
		
	}

	private static long roundDoubleToLong(double myDouble) {
		return Math.round(myDouble);
	}

	private static int roundFloatToInt(float myFloat) {
		return Math.round(myFloat);
	}

}
