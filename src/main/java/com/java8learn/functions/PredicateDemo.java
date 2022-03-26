package com.java8learn.functions;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<String> metrocityPredicate = (cityName) -> {
			List<String> metroCityList = Stream.of(METROCITIES.values()).map(METROCITIES::name)
					.collect(Collectors.toList());

			return metroCityList.contains(cityName.toUpperCase());
		};

		System.out.println("metrocityPredicate.test('Pune') :" + metrocityPredicate.test("Pune"));
		System.out.println("metrocityPredicate.test('Akola') :" + metrocityPredicate.test("Akola"));
	}

}
