package com.java8learn.functions;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		//simpleConsumerDemo
		simpleSupplierDemo();
	}

	/**
	 * 
	 */
	private static void simpleSupplierDemo() {
		// This function returns a random value.
		Supplier<Double> randomVal = ()->Math.random(); // no input arg but op is Double
		// Print the random value using get()
        System.out.println(randomVal.get()); 
	}

}
