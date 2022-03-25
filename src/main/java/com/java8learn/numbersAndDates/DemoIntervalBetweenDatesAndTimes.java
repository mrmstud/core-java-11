package com.java8learn.numbersAndDates;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * Determine how many days, hours, years elapsed between two dates
 * @author mahallem
 *
 */
public class DemoIntervalBetweenDatesAndTimes {

	public static void main(String[] args) {
		
		LocalDate bday = LocalDate.of(2013, Month.JUNE, 4);
		LocalDate today = LocalDate.now();
		dateDifference(bday, today);
	}

	private static void dateDifference(LocalDate bday, LocalDate today) {
		Period period = Period.between(bday, today);
		System.out.println("Difference between bday "+bday+" and today " +today+" is :");
		System.out.println("Days Difference : " + period.getDays());
		System.out.println("Months Difference : " + period.getMonths());
		System.out.println("Years Difference : " + period.getYears());
	}

}
