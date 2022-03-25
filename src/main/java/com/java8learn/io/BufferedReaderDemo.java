package com.java8learn.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BufferedReaderDemo {

	private static final Logger LOGGER = LogManager.getLogger(BufferedReaderDemo.class);

	public static void main(String[] args) {

		//File file = new File(Thread.currentThread().getContextClassLoader().getResource("log4j2.xml").getFile());
		File file = new File(BufferedReaderDemo.class.getClassLoader().getResource("log4j2.xml").getFile());
		LOGGER.info(file.getAbsolutePath());
		StringBuilder sb = new StringBuilder();
		// try-with-resources, ensures resources are closed automatically. Resolves memory leak.
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line;
			while((line=reader.readLine()) != null) {
				sb.append(line);
				sb.append("\n");
			}
			LOGGER.info("NumberFormatException Generator : " + Integer.parseInt("1"));
		} catch (IOException |NumberFormatException e) {
			LOGGER.error("Opps:" + e.getMessage());
			e.printStackTrace();
		} 
		
		LOGGER.info("Content of file is \n" + sb.toString());
	}

}
