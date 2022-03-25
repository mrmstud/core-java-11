package com.java8learn.multithreading;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BankAccountDemo2SynchronizedMethod {	
	
	private static final Logger LOGGER = LogManager.getLogger(BankAccountDemo2SynchronizedMethod.class);
	
	static final BankAccount account = new BankAccount(50); //Overdraft of $50

	public static void main(String[] args) {
		
		account.topUp(100); // add $100 to current balance
		
		Thread t1 = new Thread(() -> {
			ATM.withDrawSynchronized(account, 100);
		});
		
		Thread t2 = new Thread(() -> {
			ATM.withDrawSynchronized(account, 100);
		});
		
		//Two threads are trying to withdraw $100, whereas allowed withdraw is 100+50 = 150
		//However at a given time only 1 thread can enter the method because of
		//synchronized method.
		
		t1.start();
		t2.start();
	}
	

}
