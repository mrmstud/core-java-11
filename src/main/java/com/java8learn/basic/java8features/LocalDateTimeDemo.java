package com.java8learn.basic.java8features;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * You want to obtain the current date and time for use in your application.
 *
 */
public class LocalDateTimeDemo {

	private static final Logger LOGGER = LogManager.getLogger(LocalDateTimeDemo.class);

	public static void main(String[] args) {
		/* Current Date */
		LocalDate currentDate = getCurrentDate();
		LOGGER.info("Current Date : " + currentDate);

		/* Current Time */
		LocalTime currentTime = getCurrentTime();
		LOGGER.info("Current Time : " + currentTime);

		/* Get Date from specified string */
		String strDate = "08/15/1947"; // Format is MM/DD/YYYY
		LocalDate fromStrDate = getDateFromSpecifiedString(strDate);
		LOGGER.info("Current fromStringDate  : " + fromStrDate);

		/*
		 * You want to add a number of days or subtract a number of weeks from a given
		 * date or time.
		 */
		strDate = "03/24/2021"; //date in MM/dd/yyyy
		LocalDate after7Days = addDaysToCurrentDate(getDateFromSpecifiedString(strDate), 7);
		LOGGER.info("Current after7Days  : " + after7Days);
		LocalDate after4Weeks = addWeeksToCurrentDate(getDateFromSpecifiedString(strDate), 4);
		LOGGER.info("Current after7Days  : " + after4Weeks);
		LocalTime after1Hour = addHoursToTime(getCurrentTime(), 1);
		LOGGER.info("Current after1Hour  : " + after1Hour);

	}

	private static LocalTime addHoursToTime(LocalTime currentTime, long hours) {
		return currentTime.plusHours(hours);
	}

	private static LocalDate addWeeksToCurrentDate(LocalDate dateFromSpecifiedString, long weeks) {
		return dateFromSpecifiedString.plusWeeks(weeks);
	}

	private static LocalDate addDaysToCurrentDate(LocalDate dateFromSpecifiedString, long days) {
		return dateFromSpecifiedString.plusDays(days);
	}

	/**
	 * Obtaining a Date from a Specified String
	 * 
	 * @param strDate Date of String type in MM/DD/YYYY format
	 * @return LocalDate type
	 */
	private static LocalDate getDateFromSpecifiedString(String strDate) {
		/*
		 * Utilize a DateTimeFormatter to set the format of the specified string of text
		 * and then call on the LocalDate.parse() method, passing the string of text as
		 * the first argument and the formatter as the second. The following lines of
		 * code demonstrate this process.
		 */
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		return LocalDate.parse(strDate, dateTimeFormatter);
	}

	/**
	 * Gets current time
	 * 
	 * @return current-time
	 */
	private static LocalTime getCurrentTime() {
		return LocalTime.now();
	}

	/**
	 * Gets current date
	 * 
	 * @return current-date
	 */
	private static LocalDate getCurrentDate() {
		return LocalDate.now();
	}

}
