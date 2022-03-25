package com.java8learn.multithreading;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadExample1 extends Thread {
	
	private static final Logger LOGGER = LogManager.getLogger(ThreadExample1.class);
	
	@Override
	public void run() {
		int i = 1;
		while (i<=100) {
			LOGGER.info(i + " " + this.getName());
			i++;
		}
	}

}
