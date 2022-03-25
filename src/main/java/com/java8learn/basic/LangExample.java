package com.java8learn.basic;

public class LangExample {
	public static void main(String args[]) {
		Runtime r = Runtime.getRuntime();
		Process p = null;
		long first, second;
		String data[] = new String[1000];
		
		System.out.println("Memory =: " + r.totalMemory());
		first = r.freeMemory();
		System.out.println("Free Memory =: " + first);
		
		r.gc();
		
		first = r.freeMemory();
		System.out.println("After Garbage Collection: " + first);
		
		for (int i = 0; i < 1000; i++)
			data[i] = new String("i");
		
		second = r.freeMemory();
		System.out.println("After allocation: " + second);
		System.out.println("Memory used by String Array: " + (first - second));
		for (int i = 0; i < 1000; i++)
			data[i] = null;
		r.gc(); // request garbage collection
		second = r.freeMemory();
		System.out.println("Free memory after collecting discarded Strings: " + second);
		System.out.println(" Using Runtime to open a Calculator ");
		try {
			p = r.exec("calc");
		} catch (Exception e) {
			System.out.println("Error Opening the Calculator.");
		}
	}
}