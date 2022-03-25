package com.java8learn.numbersAndDates;

import java.util.Random;

/**
 * Generates random numbers
 *
 */
public class RandomNumberGeneratorDemo {

	public static void main(String[] args) {
		generateRandomNumberUsingRandomClass();
		generateRandomNumberUsingMathClass();
	}

	private static void generateRandomNumberUsingRandomClass() {

		System.out.println("Generate Random Numbers Using java.util.Random Class ");

		// Create instance of Random class
		Random random = new Random();

		// Generate random int
		int randomInt = random.nextInt(); // returns random int
		System.out.println("random int = " + randomInt);

		// Generate random double
		double randomDouble = random.nextDouble(); // return random double
		System.out.println("random double = " + randomDouble);

		// Generate random float
		float randomFloat = random.nextFloat();
		System.out.println("random float = " + randomFloat);

		// Generate random long
		System.out.println("random long = " + random.nextLong());

		// Generate random booleans
		System.out.println("random boolean = " + random.nextBoolean());

		/*
		 * random int = -1491739255 
		 * random double = 0.9300818400742024 
		 * random float =0.68647045 
		 * random long = 6807281872659648904 
		 * random boolean = false
		 */
	}

	private static void generateRandomNumberUsingMathClass() {

		System.out.println("Generate Random Numbers Using java.lang.Math Class ");

		// Math.random() returns a double value that is greater than 0.0, but less than
		// 1.0.
		double randomDouble = Math.random();
		System.out.println("random double = " + randomDouble);
		

	}

}
