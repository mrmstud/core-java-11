package com.java8learn.multithreading;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadDemo3 {
	
	private static final Logger LOGGER = LogManager.getLogger(ThreadDemo3.class);
	private static double num1 = 10;
	private static double result;

	public static void main(String[] args) {

		LOGGER.info(Thread.activeCount());
		
		
		// Now create thread with lambda
		Thread th1 = new Thread(() -> {
			if(num1 == 10) {
				try {
					Thread.sleep(0);
					result = num1/2.0;
					LOGGER.info("Result is " + Thread.currentThread().getName()+ ":" + result);
					/*
					 * result supposed to be 5.0, however 
					 * 1. if DivisorThread sets num1=10 and before it executes division
					 * 2. AssignmentThread sets num1=12 and then DivisorThread does division
					 * then ans o.e. result can be 6.0 
					 * 
					 * Result is DivisorThread:6.0
					 */
				} catch (InterruptedException e) {
					LOGGER.error(e.getMessage());
					e.printStackTrace();
				}
			}
		});
		
		th1.setName("DivisorThread");
		
		Thread th2 = new Thread(() -> {
			num1 = 12;
		});
		
		th2.setName("AssignmentThread");
		
		th1.start();
		th2.start();
		
		LOGGER.info("Program Executed successfully");
	}

}
