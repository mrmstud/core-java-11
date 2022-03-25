package com.java8learn.functions;

import java.util.function.Function;

public class LambdaReverseStringDemo {

	public static void main(String[] args) {
		Function<String, String> revFunction = (inputText) -> {
			StringBuilder sb = new StringBuilder(inputText);
			return sb.reverse().toString();
		};
		
		String revString = revFunction.apply("HELLO WORLD ONE");
		System.out.println("Orig Str = HELLO WORLD ONE" + " and Rev String is = "+ revString);
	}

}
