package com.java8learn.multithreading;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.java8learn.utils.MyUtility;

public class ThreadDemo {
	
	
	private static final Logger LOGGER = LogManager.getLogger(ThreadDemo.class);

	public static void main(String[] args) {
		LOGGER.info(Thread.activeCount());
		
		ThreadExample1 th1 = new ThreadExample1(); // thread is waiting state
		th1.setName("MyFirstThread"); // This is useful to track multiple thread
		th1.start(); // thread is set to alive and run() is called
		
		// Now to run another thread
		ThreadExample1 th2 = new ThreadExample1(); // thread is waiting state
		th2.setName("MySecondThread"); // This is useful to track multiple thread
		th2.start(); // thread is set to alive and run() is called
		
		LOGGER.info(MyUtility.printThreadInfo(th1));// Thread Info:[Thread Name = MyFirstThread, Priority = 5, State = RUNNABLE, isAlive = true, isDeaemon = false]
		LOGGER.info(MyUtility.printThreadInfo(th2));// Thread Info:[Thread Name = MySecondThread, Priority = 5, State = RUNNABLE, isAlive = true, isDeaemon = false]
	}

}
