package com.java8learn.numbersAndDates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Dates need to be displayed by your application using a specific format. You
 * want to define that format once and apply it to all dates that need to be
 * displayed.
 * 
 * @author mahallem
 *
 */
public class DemoDateFormatter {

	public static void main(String[] args) {
		LocalDate currDate = LocalDate.now();
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d-MMM-uuuu");// prints 2-Mar-2021
		System.out.println("Current date " + currDate + " in d-MMM-uuuu format : " + currDate.format(formatter1));

		String dateString = "31-Dec-2021";
		LocalDate newYearEve = null;
		try {
			newYearEve = LocalDate.parse(dateString, formatter1);
		} catch (DateTimeParseException e) {
			System.err.println(e);
			e.printStackTrace();
		}
		System.out.println("This year, a New year Eve is on : " + newYearEve.getDayOfWeek());

		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/YY HH:mm:ss");
		/*
		 * LocalDate represents just a date, not a DateTime. So "HH:mm:ss" make no sense
		 * when formatting a LocalDate. Use a LocalDateTime instead, assuming you want
		 * to represent both a date and time. Otherwise you will get Exception in thread
		 * "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported
		 * field: HourOfDay
		 */
		LocalDateTime ldtcurrDateTime = currDate.atTime(LocalTime.now());
		System.out.println(
				"Current date " + currDate + " in 'MM/dd/YY HH:mm:ss' format : " + ldtcurrDateTime.format(formatter2));
		/*
		 * LocalDate represents just a date, not a DateTime. So "HH:mm:ss" make no sense
		 * when formatting a LocalDate. Use a LocalDateTime instead, assuming you want
		 * to represent both a date and time. Otherwise you will get Exception in thread
		 * "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported
		 * field: HourOfDay
		 */
		LocalDateTime localDateTime = newYearEve.atTime(11, 55);
		System.out.println(
				"New Year date " + newYearEve + " in 'MM/dd/YY HH:mm:ss' : " + localDateTime.format(formatter2));

	}

}
