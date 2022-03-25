package com.java8learn.multithreading;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadExample2 implements Runnable {
	/*
	 * This is best way to implement thread because this allow to extend another
	 * classes if you wanted to
	 */
	private static final Logger LOGGER = LogManager.getLogger(ThreadExample2.class);

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			LOGGER.info(i + " " + Thread.currentThread().getName());
		}
	}

}
