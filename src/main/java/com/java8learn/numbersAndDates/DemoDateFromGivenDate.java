package com.java8learn.numbersAndDates;

import java.time.LocalDate;
import java.time.Month;

public class DemoDateFromGivenDate {

	public static void main(String[] args) {
		/*
		 * Invoke the LocalDate.of() method for the year, month, and day for which you
		 * want to obtain the object. For example, suppose that you want to obtain a
		 * date object for a specified date in March/April of 2021.
		 */
		LocalDate dateSecondMarch21 = LocalDate.of(2021, Month.MARCH, 2);
		System.out.println("dateSecondMarch21 : " + dateSecondMarch21.getDayOfWeek());

		LocalDate dateAprFirst = LocalDate.of(2021, Month.APRIL, 1);
		System.out.println("dateAprFirst = " + dateAprFirst.getDayOfWeek());
	}

}
