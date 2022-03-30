package com.java8learn.basic;

import java.util.function.Function;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReverseNumber {
	
	private static final Logger LOGGER = LogManager.getLogger(ReverseNumber.class);
	public static void main(String[] args) {
		
		Function<Integer, Integer> reverseFun = (num) -> {
			int revNum = 0;
			int rem = 0; //remainder
			LOGGER.debug("Number passed for processing is " + num);
			while(num>0) {
				rem = num%10;
				revNum = rem + (revNum*10);
				num = num/10;
			}
			return revNum;
		};
		
		LOGGER.info("Reverse of " + 9001 + " is "+ reverseFun.apply(9001));
		LOGGER.info("Reverse of " + 1984 + " is "+ reverseFun.apply(1984));
	}

}
