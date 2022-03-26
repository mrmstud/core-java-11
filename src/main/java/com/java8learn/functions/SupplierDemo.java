package com.java8learn.functions;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		//simpleConsumerDemo
		simpleConsumerDemo();
	}

	/**
	 * 
	 */
	private static void simpleConsumerDemo() {
		// This function returns a random value.
		Supplier<Double> randomVal = ()->Math.random(); // no input arg but op is Double
		// Print the random value using get()
        System.out.println(randomVal.get()); 
	}

}
