package com.java8learn.numbersAndDates;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class DemoLocalTime {

	public static void main(String[] args) {
		LocalTime currTime = LocalTime.now();
		System.out.println("currnt time = " + currTime );
		
		System.out.println("LocalDateTime = " + LocalDateTime.now());
	}

}
