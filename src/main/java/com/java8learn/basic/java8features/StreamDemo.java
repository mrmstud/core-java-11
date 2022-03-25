package com.java8learn.basic.java8features;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> cityList = Arrays.asList("Akola","Pune","Nagpur","Mumbai", "Kolkata","Amravati");
		cityList.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);
	}

}
