package com.java8learn.basic;

import com.java8learn.functions.ActionCode;

/**
 * The body of a lambda expression can contain any Java construct that an
 * ordinary method may contain.
 * 
 * @author mahallem
 *
 */
public class LambdaActionCodeDemo {

	/*
	 * NOTE: A lambda expression can contain any statement that an ordinary Java
	 * method contains. However, the continue and break keywords are illegal at the
	 * top level.
	 */

	public static void main(String[] args) {
		/*
		 * The following lambda expression body contains a block of code, which returns
		 * an int, based upon the string value of the argument passed into the
		 * expression.
		 */
		ActionCode actionCode = (code) -> {
			switch (code) {
			case "ACTIVE":
				return 1;
			case "INACTIVE":
				return 0;
			default:
				return -1;
			}
		};

		int returnCode = actionCode.returnCode("ACTIVE");
		System.out.println("return code for 'ACTIVE' is = " + returnCode);

		returnCode = actionCode.returnCode("INACTIVE");
		System.out.println("return code for 'INACTIVE' is = " + returnCode);

		returnCode = actionCode.returnCode("INVALID");
		System.out.println("return code for 'INVALID' is = " + returnCode);

	}

}
