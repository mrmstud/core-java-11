package com.java8learn.numbersAndDates;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.Function;

/**
 * Use the BigDecimal data type to perform the calculation on all money/currency
 * value.
 */
public class DemoCurrencyFormatterConverter {

	public static void main(String[] args) {
		BigDecimal currency1 = new BigDecimal("25.65");
		BigDecimal currency2 = new BigDecimal("187.32");
		BigDecimal currency3 = new BigDecimal("4.86");
		BigDecimal result;
		// add all 3 currency
		result = currency1.add(currency2).add(currency3);
		// convert result to double and send to formatDollars, returning a string
		// String formattedDollarCurrency = formatDollars(result.doubleValue());
		String formattedDollarCurrency = formatCurrency(result.doubleValue(),
				DecimalFormat.getCurrencyInstance(Locale.US)::format);
		// prints Formatter Dollar Val = $217.83
		System.out.println("Formatter Dollar Val = " + formattedDollarCurrency);
		// print in Indian currency
		// System.out.println("Formatted INR Val = " + formatINR(result.doubleValue()));
		String formattedINRCurrency = formatCurrency(result.doubleValue(),
				d -> DecimalFormat.getCurrencyInstance(new Locale("en", "IN")).format(d)); // lambda fun
		System.out.println("Formatted INR Val = " + formattedINRCurrency);

	}

	private static String formatINR(double result) {
		return DecimalFormat.getCurrencyInstance(new Locale("en", "IN")).format(result);
	}

	/**
	 * This method accepts a double value and performs formatting on it using the
	 * NumberFormat class based on the U.S. locale. It then returns a string value
	 * representing currency
	 * 
	 * @param doubleValue
	 * @return String type of formatted currency value in US local i.e. $217.83
	 */
	private static String formatDollars(double doubleValue) {
		NumberFormat dollarFormat = DecimalFormat.getCurrencyInstance(Locale.US);
		return dollarFormat.format(doubleValue);
	}

	/**
	 * 
	 * @param doubleValue
	 * @param currFun
	 * @return
	 */
	private static String formatCurrency(double doubleValue, Function<Double, String> currFun) {
		return currFun.apply(doubleValue);
	}

}
