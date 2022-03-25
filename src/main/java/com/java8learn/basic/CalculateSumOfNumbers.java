/**
 * 
 */
package com.java8learn.basic;

import java.util.function.Function;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mahallem
 *
 */
public class CalculateSumOfNumbers {
	
	
	private static final Logger LOGGER = LogManager.getLogger(CalculateSumOfNumbers.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.debug("Staring program...");
		int num = 1984;
		Function<Integer, Integer> mathFun = (a)-> {
			LOGGER.debug(String.format("Number passed for processing is %d", a));
			int sumOfNum = 0;
			int remainder = 0;
			while(a>0) {
				remainder = a%10;
				sumOfNum = sumOfNum + remainder;
				a = a/10;
			}
			return sumOfNum;
		};
		
		LOGGER.info("Sum of " + num +" is = " + mathFun.apply(num));
		LOGGER.info("Sum of " + 1947 +" is = " + mathFun.apply(1947));
		LOGGER.info("Sum of " + 31081984 +" is = " + mathFun.apply(31081984));
	}

}
