/**
 * 
 */
package com.java8learn.basic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Pass values into a Java application via the CMD line Run the application
 * using the java command, and specify the arguments that you want to pass into
 * it after the application name. If you're passing more than one argument, each
 * should be separated by a space.
 *
 */
public class PassingArgumentsViaCMDLine {
	/**
	 * IllegalArgumentException Message constant
	 */
	private static final String ERROR_MSG_ARGUMENT = "Zero No. of arguments passed. At least 1 argument is expected!!";
	/**
	 * Static field org.apache.logging.log4j.Logger
	 */
	private static final Logger LOGGER = LogManager.getLogger(PassingArgumentsViaCMDLine.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Enclose strings in double quotes when you want to pass an argument containing
		 * spaces or other special characters. For example:
		 * 
		 * java org.java8recipes.chapter01.recipe1_06.PassingArguments "Upper Peninsula"
		 * 
		 */
		LOGGER.info("Execution started");
		if (args.length > 0) {
			LOGGER.info("No. of args passed are : " + args.length + ".Those are as below:\n");
			for (String arg : args) {
				LOGGER.info(arg);
			}
		} else {
			LOGGER.error(ERROR_MSG_ARGUMENT);
			throw new IllegalArgumentException(ERROR_MSG_ARGUMENT);
		}
		LOGGER.info("Execution completed");
	}

}
