package com.java8learn.basic;

public class StringConcatenateVsStringBuilderVsStringFormat {

	private static final int COUNTER = 1_00_000;

	public static void main(String[] args) {
		/*
		 * long time1 = System.currentTimeMillis(); usingStringConcatenation(COUNTER);
		 * System.out.println("usingStringConcatenation " + (System.currentTimeMillis()
		 * - time1) + " ms");
		 */

		long time1 = System.currentTimeMillis();
		usingStringBuilder(COUNTER);
		System.out.println("usingStringBuilder " + (System.currentTimeMillis() - time1) + " ms");
		
		/*
		 * time1 = System.currentTimeMillis(); usingStringFormat(COUNTER);
		 * System.out.println("usingStringFormat " + (System.currentTimeMillis() -
		 * time1) + " ms");
		 */


		
	}
	
	private static void usingStringBuilder(int n)
	{
	    StringBuilder str = new StringBuilder();
	    for(int i=0;i<n;i++) {
	        str.append("myBigString").append("hello");
	    }
	}

	private static void usingStringConcatenation(int n)
	{
	    String str = "";
	    for(int i=0;i<n;i++) {
	        str+="myBigString";
	    	str+="hello";
	    }
	}
	
	private static void usingStringFormat(int n)
	{
	    String str = "";
	    for(int i=0;i<n;i++) {
	        String.format("%s%s%s", str,"myBigString","hello");
	    }
	}

}
