package com.java8learn.functions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PassingLambdaFuncAsArgument {
	
	private static final Logger LOGGER = LogManager.getLogger(PassingLambdaFuncAsArgument.class);
	public static void main(String[] args) {
		LOGGER.info("addition of three ints = " + computeThreeInt((a,b,c)->a+b+c) );
		LOGGER.info("multiple of three ints = " + computeThreeInt((a,b,c)->a*b*c) );
		LOGGER.info("add 1st two and substract 3rd of three ints = " + computeThreeInt((a,b,c)->a+b-c) );
		//This is the benefit of lambda functions, we can passs behvior to method and then
		//we don't have to write separate method for separate logic until argument and return
		//type matches.
	}
	
	private static Integer computeThreeInt(TriFunction<Integer, Integer, Integer, Integer> addFun) {
		return addFun.apply(10, 20, 30);
	}

}
