package com.java8learn.utils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyUtility {

	private static final String THREAD_INFO_MSG = "\n Thread Info:[Thread Name = %s, Priority = %d, State = %s, isAlive = %s, isDeaemon = %s]";

	public static boolean isNullOrEmpty(String[] args) {
		boolean nullOrEmptyStringArray = false;
		if (null == args) {
			nullOrEmptyStringArray = true;
			throw new IllegalArgumentException("String[] args is NULL. Enter non null values");
		} else if (args.length == 0) {
			nullOrEmptyStringArray = true;
			throw new IllegalArgumentException("String[] args is EMPTY. Enter some values");
		}
		return nullOrEmptyStringArray;
	}

	/**
	 * Prints comma separated elements of provided array
	 * 
	 * @param objArray array object to print
	 */
	public static void printObjectArray(Object[] objArray) {
		for (Object element : objArray) {
			System.out.print(element + ",");
		}
	}

	/**
	 * Sort passes array object in the natural order
	 * 
	 * @param objArray array object to print
	 */
	public static Object[] sortObjectArray(Object[] objArray) {
		Arrays.sort(objArray);
		return objArray;
	}

	public static Object[] reverseKElementsInArray(Object[] zipCodeArray, int noOfElementsToSort) {
		System.out.println(" First No of elements to sort the array => " + noOfElementsToSort);
		if (zipCodeArray.length == 0 || noOfElementsToSort == 0) {
			System.err.println("Either array or noOfElementsToSort is zero.");
			return zipCodeArray;
		}

		Arrays.sort(zipCodeArray, 0, noOfElementsToSort);
		return zipCodeArray;
	}

	/**
	 * Gets list of Persons
	 * 
	 * @return pList returns list of Persons
	 */
	public static List<Person> getPersonList() {

		List<Person> pList = new ArrayList<>();

		// Create Person List
		Person p1 = new Person(160L, "Rohit", "Sharma", LocalDate.of(1960, 8, 31),new BigDecimal("13500.00"));
		Person p2 = new Person(125L, "Shubh", "Gill", LocalDate.of(1925, 1, 3), new BigDecimal("29700.00"));
		Person p3 = new Person(90L, "Virat", "Kohli", LocalDate.of(1990, 11, 30), new BigDecimal("33800.85"));
		Person p4 = new Person(1875L, "Ajinkya", "Rahane", LocalDate.of(1975, 5, 13), new BigDecimal("13500.01"));
		Person p5 = new Person(20L, "Rohit", "Pujara", LocalDate.of(1984, 6, 15), new BigDecimal("13500.99"));
		Person p6 = new Person(161L, "Rohit", "Gill", LocalDate.of(1961, 8, 30), new BigDecimal("33500.00"));
		Person p7 = new Person(126L, "Ravi", "Ashwin", LocalDate.of(1926, 1, 2), new BigDecimal("93500.00"));
		Person p8 = new Person(91L, "Hardik", "Pandya", LocalDate.of(1991, 11, 29), new BigDecimal("53500.00"));
		Person p9 = new Person(1876L, "Ajinkya", "Rahane", LocalDate.of(1976, 5, 12), new BigDecimal("73500.00"));
		Person p10 = new Person(21L, "Mayank", "Agarwal", LocalDate.of(1985, 6, 14), new BigDecimal("3500.00"));

		pList = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);

		return pList;
	}

	public static List<Apple> getAppleList() {
		return Arrays.asList(new Apple(200, COLOR.GREEN), new Apple(100, COLOR.GREEN), new Apple(150, COLOR.GREEN),
				new Apple(200, COLOR.RED), new Apple(150, COLOR.RED), new Apple(100, COLOR.RED),
				new Apple(200, COLOR.PINK), new Apple(150, COLOR.PINK), new Apple(100, COLOR.PINK),
				new Apple(100, COLOR.YELLOW));
	}

	/**
	 * @param thread
	 * @return
	 */
	public static String printThreadInfo(Thread thread) {
		return String.format(THREAD_INFO_MSG, thread.getName(), thread.getPriority(), thread.getState(),
				thread.isAlive(), thread.isDaemon());
	}
}
