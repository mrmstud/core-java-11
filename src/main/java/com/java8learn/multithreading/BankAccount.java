package com.java8learn.multithreading;

/**
 * @author mahallem
 *
 */
public class BankAccount {
	
	private int balance = 0;
	private int overdraft;
	
	public BankAccount() {
		super();
	}

	public BankAccount(int overdraft) {
		super();
		this.overdraft = overdraft;
	}
	
	public void topUp(int amount) {
		balance += amount;
	}
	
	public void debit(int amount) {
		balance -= amount;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int getOverdraft() {
		return overdraft;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", overdraft=" + overdraft + "]";
	}
}
