package com.java8learn.basic;

import java.util.regex.Pattern;

// Reusing expensive object for improved performance
// Suppose you want to write a method to determine whether a string is a valid Roman numeral.
public class RomanNumerals {
	private static final Pattern ROMAN = Pattern
			.compile("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

	static boolean isRomanNumeral(String s) {
		return ROMAN.matcher(s).matches();
	}
}