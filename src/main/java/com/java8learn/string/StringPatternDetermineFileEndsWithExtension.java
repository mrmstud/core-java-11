package com.java8learn.string;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringPatternDetermineFileEndsWithExtension {

	private static final Logger LOGGER = LogManager.getLogger(StringPatternDetermineFileEndsWithExtension.class);

	public static void main(String[] args) {

		String[] fileNameExtensions = { ".docx, .xlsx, .txt, .msg, .java" };
		List<String> fileNames = Arrays.asList("Doc1.docx", "Doc1.doc", "Excel1.xlsx", "Excel2.xls", "Text1.txt",
				"Text2.txt", "Email1.msg", "Class1.java", "FileWithNoExtension");

		displayFileCountByTypes(fileNameExtensions, fileNames);
		displayFilesOfType(fileNames, ".docx"); // works by passing String

		// Now let's try by pattern
		Pattern p = Pattern.compile("Doc");
		for (String fileName : fileNames) {
			if (p.matcher(fileName).find()) {
				System.out.println(fileName);
			}
		}

	}

	/**
	 * Prints File Names of given file type to the console
	 * 
	 * @param fileNames List of filenames
	 * @param extn      Extension type like .docx, .java, etc
	 */
	private static void displayFilesOfType(List<String> fileNames, String extn) {
		/*
		 * In the following example, assume that the variable fileName contains the name
		 * of a given file, and the code is using the endsWith() method to determine
		 * whether filename ends with a particular string.:
		 */

		List<String> filterdFileList = fileNames.stream().filter(a -> a.endsWith(extn)).collect(Collectors.toList());
		filterdFileList.forEach(System.out::println);
	}

	private static void displayFileCountByTypes(String[] fileNameExtensions, List<String> fileNames) {
		// TODO
		LOGGER.error("Not Implemented Yet");
	}

}
