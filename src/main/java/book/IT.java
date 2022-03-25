package book;

import com.java8learn.basic.BCA;

public class IT {
	public IT() {
		System.out.println("Contructor of IT");
	}

	public void showData() {
		BCA obj = new BCA();
		System.out.println("Public Data =" + obj.pub_data);
		// Error as Private Data is not Accessible
		//System.out.println("Private Data =" + obj.pri_data); 
		// Error as protected data is accessible 
		//System.out.println("Protected Data =" + obj.pro_data); 
	}

	public void showIT() {
		System.out.println("IT Class within nielit package");
	}
}