package com.java8learn.datastructure;

/**
 * Define fixed set of related constants
 * @author mahallem
 *
 */
public class DemoEnumType {

	public static void main(String[] args) {
		System.out.println("Today is : " + DAYS.THU.name()); // prints THU
		System.out.println("Ordinal of THU is : " + DAYS.THU.ordinal()); // prints 3; starting from 0
	}

}

enum DAYS {
	MON, TUE, WED, THU, FRI, SAT, SUN
}
