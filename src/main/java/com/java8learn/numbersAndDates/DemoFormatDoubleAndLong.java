package com.java8learn.numbersAndDates;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Format Double and Long in your application
 * 
 * @author mahallem
 *
 */
public class DemoFormatDoubleAndLong {

	private static final Logger LOGGER = LogManager.getLogger(DemoFormatDoubleAndLong.class);

	public static void main(String[] args) {
		// prints 345.937
		LOGGER.info("formatted value of 345.9372 is = " + formatDouble(345.9372));
		// prints 345.938
		LOGGER.info("formatted value of 345.9378 is = " + formatDouble(345.9378));
		// prints 0.770
		LOGGER.info("formatted value of .7697 is = " + formatDouble(.7697));
	}

	/**
	 * Using DecimalFormat class to format and round the values to the precision
	 * specified
	 * 
	 * @param myDouble a number of type double passed
	 * @return result String value of formatted and rounded double
	 */
	public static String formatDouble(double myDouble) {
		NumberFormat numberFormatter = new DecimalFormat("##.000");
		String result = numberFormatter.format(myDouble);
		return result;
	}
}
