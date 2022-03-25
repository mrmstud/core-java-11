package com.java8learn.numbersAndDates;

import java.time.LocalDate;
import java.time.Month;

public class DemoCompareDates {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2021, Month.APRIL, 1);
		LocalDate date2 = LocalDate.of(2021, Month.APRIL, 2);

		System.out.println("Date Compare Result compareDatesWithSwitch: " + compareDatesWithSwitch(date1, date2));
		System.out.println("Date Compare Result compareDatesWithIfElseIf: " + compareDatesWithIfElseIf(date1, date2));
	}

	private static String compareDatesWithSwitch(LocalDate date1, LocalDate date2) {
		// returns 0; if date1==date2
		// returns 1; if date1 > date2
		// returns -1; if date < date2
		String result = "";
		switch (date1.compareTo(date2)) {
		case 1:
			result = date1 + " is greater than " + date2;
			break;
		case -1:
			result = date1 + " is less than " + date2;
			break;
		case 0:
			result = date1 + " is equal to " + date2;
			break;
		default:
			result = " Invalid result !!";
			break;
		}
		return result;
	}
	
	private static String compareDatesWithIfElseIf(LocalDate date1, LocalDate date2) {
		// returns 0; if date1==date2
		// returns 1; if date1 > date2
		// returns -1; if date < date2
		String result = "";
		int compareTo = date1.compareTo(date2);
		if (compareTo == 1) {
			result = date1 + " is greater than " + date2;
		} else if (compareTo == -1) {
			result = date1 + " is less than " + date2;
		} else if (compareTo == 0) {
			result = date1 + " is equal to " + date2;
		} else {
			result = " Invalid result !!";
		}
		return result;
	}

}
