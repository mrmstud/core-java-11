package com.java8learn.streams;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.java8learn.utils.MyUtility;
import com.java8learn.utils.Person;

public class DemoFilterMapReduce {

	public static void main(String[] args) {
		List<Person> pList = MyUtility.getPersonList();
		/*
		 * pList.stream().forEach(System.out::println);
		 * 
		 * generateListofEvenNumbersFrom1to100();
		 * sortListAndPrintFirstItemInTheList(pList);
		 */
		
		double hikePercentage = 7;
		increaseSalryOfEachPersonByPercent(hikePercentage, pList);
	}

	private static void increaseSalryOfEachPersonByPercent(double hikePercentage, List<Person> pList) {
		System.out.println("hikePercentage is : " + hikePercentage);
		
		// convert List to Map < PersonId, Salry>
		System.out.println("Coverting List to Map<personId, salary> ==>");
		Map<Long, BigDecimal> personSalaryMap = pList.stream().collect(Collectors.toMap(Person::getPersonId, Person::getSalary));
		
		// sort list by personId and then print current salaries of all persons in the list
		System.out.println("sort list by personId and then print current salaries of all persons in the list ==>");
		personSalaryMap.keySet().stream().sorted().forEach(pId->System.out.println("[" + pId + "," +personSalaryMap.get(pId) + "]"));
		
		//now increase salry by given hikePercentage
		System.out.println("now increase salry by given hikePercentage ==>");
		pList.stream().forEach(p-> {
			p.setSalary(p.getSalary().add(p.getSalary().multiply(BigDecimal.valueOf(hikePercentage/100))));
		});
		System.out.println("after increase salry by given hikePercentage ==>");
		pList.stream().sorted(Comparator.comparing(Person::getPersonId)).forEach(p-> {
			System.out.println("[" + p.getPersonId() + "," +p.getSalary()+ "]");
		});
	}

	private static void sortListAndPrintFirstItemInTheList(List<Person> pList) {
		System.out.println("Before Sorting:");
		pList.stream().forEach(System.out::println);
		
		System.out.println("sortListAndPrintFirstItemInTheList - ProductList");
		
		pList.stream().sorted(Comparator.comparing(Person::getPersonId).reversed())
			.findFirst()
			.ifPresent(System.out::println);
		
	}

	private static void sortListAndPrintFirstItemInTheList() {
		System.out.println("orginalListBeforeSort:");
		System.out.println("Nagpur\",\"Pune\",\"Akola\",\"Chennai\",\"Kolkata\",\"Delhi\",\"Mumbai");
		System.out.println("sortListAndPrintFirstItemInTheList:");
		Stream.of("Nagpur","Pune","Akola","Chennai","Kolkata","Delhi","Mumbai")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
	}

	private static void generateListofEvenNumbersFrom1to100() {
		System.out.println("generateListofEvenNumbersFrom1to100:");
		IntPredicate isEven = i->i%2==0;
		IntStream.rangeClosed(1, 100) //both inclusive
		.filter(isEven)
		.forEach(System.out::println);
	}

}
