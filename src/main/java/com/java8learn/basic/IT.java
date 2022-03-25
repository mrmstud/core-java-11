package com.java8learn.basic;

public class IT extends BCA {
	public IT() {
		System.out.println("Constructor of IT");
	}

	public void showData() {
		System.out.println("Public Data =" + pub_data);
		// Error as Private Data is not Accessible
		//System.out.println("Private Data =" + pri_data); 
		System.out.println("Protected Data =" + pro_data);
	}

	public void showIT() {
		System.out.println("IT Class within nielit package");
	}
}