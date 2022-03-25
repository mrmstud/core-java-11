package com.java8learn.multithreading;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadDemo2 {
	
	
	private static final Logger LOGGER = LogManager.getLogger(ThreadDemo2.class);

	public static void main(String[] args) {
		LOGGER.info(Thread.activeCount());
		
		//ThreadExample2 implements Runnable interface
		Thread th1 = new Thread(new ThreadExample2()); // thread is waiting state
		th1.setName("MyFirstRunnableThread"); // This is useful to track multiple thread
		th1.start(); // thread is set to alive and run() is called
		
		// Now to run another thread
		Thread th2 = new Thread(new ThreadExample2()); // thread is waiting state
		th2.setName("MySecondRunnableThread"); // This is useful to track multiple thread
		th2.start(); // thread is set to alive and run() is called
		
		// Now 3rd thread
		Thread th3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++) {
					LOGGER.info(i + " " + Thread.currentThread().getName());
				}
			}
		});
		th3.setName("MyThirdThreadInnerClass");
		th3.start();
		
		// Now 4th thread with lambda
		Thread th4 = new Thread(() -> {
		for (int i = 1; i <= 100; i++) {
			LOGGER.info(i + " " + Thread.currentThread().getName());
		}
		});
		th4.setName("MyFourthThreadWithLambda");
		th4.start();
		
	}

}
