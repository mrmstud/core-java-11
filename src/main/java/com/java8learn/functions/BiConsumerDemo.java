package com.java8learn.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		// compares two list of Integers
		BiConsumer<List<Integer>, List<Integer>> biConsumerFunction = (listA, listB) -> {
			if (listA.size() != listB.size()) {
				System.out.println("ListA is not equal to ListB");
			} else {
				for (int i = 0; i < listA.size(); i++) {
					if (listA.get(i) != (listB.get(i))) {
						System.out.println("ListA is not equal to ListB");
						break;
					}
				}
				System.out.println("ListA is equal to ListB");
			}
		};

		// Create the first list
		List<Integer> numList1 = new ArrayList<Integer>();
		numList1.add(2);
		numList1.add(1);
		numList1.add(3);

		// Create the second list
		List<Integer> numList2 = new ArrayList<Integer>();
		numList2.add(2);
		numList2.add(1);
		numList2.add(3);

		// Create the third list, diff values
		List<Integer> numList3 = new ArrayList<Integer>();
		numList3.add(20);
		numList3.add(10);
		numList3.add(30);

		// Create the third list, diff size
		List<Integer> numList4 = new ArrayList<Integer>();
		numList3.add(2);
		numList3.add(1);
		numList3.add(3);
		numList3.add(2);
		numList3.add(1);
		numList3.add(3);

		// Below comparison prints equal
		biConsumerFunction.accept(numList1, numList2);

		// Below comparison prints not equal
		biConsumerFunction.accept(numList1, numList3);
		// Below comparison prints not equal
		biConsumerFunction.accept(numList1, numList4);

	}

}
