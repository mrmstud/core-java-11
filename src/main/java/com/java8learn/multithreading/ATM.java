package com.java8learn.multithreading;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ATM {

	private static final String ERROR_MSG_INSTANTIATION = "Private Constructor, won't instantiate!!";
	private static final Logger LOGGER = LogManager.getLogger(ATM.class);
	
	// All methods are static and hence instantiation is prohibited
	private ATM() {
		throw new PrivateInstantiationException(ERROR_MSG_INSTANTIATION);
	}

	public static void withDraw(BankAccount account, int amount) {
		doWithDraw(account, amount);
	}

	/**
	 * @param account
	 * @param amount
	 */
	private static void doWithDraw(BankAccount account, int amount) {
		int balance = account.getBalance();
		if ((balance - amount) < -account.getOverdraft()) {
			LOGGER.info("Transaction Denied");
		} else {
			account.debit(amount);
			LOGGER.info(String.format("$%d successfully withdrawn!!", amount));
		}
		LOGGER.info(String.format("Current Balance: %d", account.getBalance()));
	}

	public static synchronized void withDrawSynchronized(BankAccount account, int amount) {
		doWithDraw(account, amount);
	}

}
