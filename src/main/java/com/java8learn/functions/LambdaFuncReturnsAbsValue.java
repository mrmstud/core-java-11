package com.java8learn.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LambdaFuncReturnsAbsValue {
	
	private static final Logger LOGGER = LogManager.getLogger(LambdaFuncReturnsAbsValue.class);
	public static void main(String[] args) {
		//Lambda function returns absolute value of Int
		getAbsOf();
		
		//Lambda Bifunction returns addition of two Int
		getAdditionOf();
		
		//Custom Lambda TriFunction returns addition of 3 Int
		getAdditionOfThree();
	}
	
	/**
	 * 
	 */
	private static void getAdditionOfThree() {
		TriFunction<Integer, Integer, Integer, Integer> addThreeFun = (a,b,c)->a+b+c;
		LOGGER.info("addFun.apply(10,15,20) = " + addThreeFun.apply(10,15,20));
		LOGGER.info("addFun.apply(-10,15,-20) = " + addThreeFun.apply(-10,15,-20));
	}

	/**
	 * 
	 */
	private static void getAdditionOf() {
		BiFunction<Integer, Integer, Integer> addFun = (num1, num2) -> num1+num2;
		LOGGER.info("addFun.apply(10,15) = " + addFun.apply(10,15));
		LOGGER.info("addFun.apply(-10,15) = " + addFun.apply(-10,15));
	}
	/**
	 * 
	 */
	private static void getAbsOf() {
		Function<Integer, Integer> absoluteInt = (num) -> (num<0) ? num*-1: num ;
		LOGGER.info("absoluteInt.apply(-10) = " + absoluteInt.apply(-10));
		LOGGER.info("absoluteInt.apply(5) = " +absoluteInt.apply(5));
	}

}
