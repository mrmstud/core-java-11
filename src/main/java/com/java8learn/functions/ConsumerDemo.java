package com.java8learn.functions;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> consumerFunction = (cityName) -> {
			if (isMetroCity(cityName.toUpperCase())) {
				System.out.println(cityName.toUpperCase() + " is a Metrocity");
			} else {
				System.out.println(cityName.toUpperCase() + " is not a Metrocity");
			}
		};

		consumerFunction.accept("Pune");
		consumerFunction.accept("Akola");
	}

	/**
	 * Check if passed city is a Metro City
	 * 
	 * @param cityName Name of city to verify if metro-city or not
	 * @return true|false based on outcome of city is metro-city or not
	 */
	private static boolean isMetroCity(String cityName) {
		/*
		 * Below code converts METROCITIES enum collection to the List<String>
		 */
		List<String> metrocityList = Stream.of(METROCITIES.values())
				.map(METROCITIES::name) // map converts collection of 1 type to another
				.collect(Collectors.toList()); // returns the list of cities
		return metrocityList.contains(cityName);
	}

}
