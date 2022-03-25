package com.java8learn.multithreading;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.java8learn.utils.MyUtility;

public class DeadlockDemo {

	
	private static final Logger LOGGER = LogManager.getLogger(DeadlockDemo.class);

	private static Object spoon = new Object();
	private static Object bowl = new Object();
	
	public static void main(String[] args) {
		
		//Thread 1
		Thread cook1 = new Thread(() -> {
			synchronized (spoon) { // spoon obj is monitor lock
				LOGGER.info("Cook 1 holding the spoon");
				LOGGER.info("Cook 1 waiting for the bowl");
			}
			
			synchronized (bowl) { // bowl as monitor lock
				LOGGER.info("Cook 1 holding the spoon and the bowl");
			}
		});
		
		//Thread2
		Thread cook2 = new Thread(() -> {
			synchronized (bowl) { //bowl is monitor lock
				LOGGER.info("Cook 2 holding the bowl");
				LOGGER.info("Cook 2 waiting for the spoon");
			}
			
			synchronized (spoon) { // spoon is monitor lock
				LOGGER.info("Cook 2 holding the spoon and the bowl");
			}
		});
		
		LOGGER.info("Before Cook1 thread starts: " + MyUtility.printThreadInfo(cook1));
		cook1.start(); // Both Thread are waiting for each other
		LOGGER.info("After Cook1 thread starts: " +MyUtility.printThreadInfo(cook1));
		cook2.start();
	}
	
	/*
	 * Output
2021-02-25 13:57:57 [Thread-1] INFO  com.java8learn.multithreading.DeadlockDemo - Cook 1 holding the spoon
2021-02-25 13:57:57 [Thread-2] INFO  com.java8learn.multithreading.DeadlockDemo - Cook 2 holding the bowl
2021-02-25 13:57:57 [Thread-2] INFO  com.java8learn.multithreading.DeadlockDemo - Cook 2 waiting for the spoon
2021-02-25 13:57:57 [Thread-1] INFO  com.java8learn.multithreading.DeadlockDemo - Cook 1 waiting for the bowl
	 */

}
