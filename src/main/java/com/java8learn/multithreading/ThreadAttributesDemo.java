package com.java8learn.multithreading;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.java8learn.utils.MyUtility;

public class ThreadAttributesDemo {
	
	
	private static final Logger LOGGER = LogManager.getLogger(ThreadAttributesDemo.class);


	public static void main(String[] args) {
		LOGGER.info(MyUtility.printThreadInfo(Thread.currentThread()));
	}


	

}
