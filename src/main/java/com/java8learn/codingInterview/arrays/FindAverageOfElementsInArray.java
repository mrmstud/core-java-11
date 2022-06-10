package com.java8learn.codingInterview.arrays;

public class FindAverageOfElementsInArray {

	public static void main(String[] args) {

		float[] marks = { 1.5f, 2.5f, 4.5f, 5.0f };
		float avg = getAverageMarks(marks);
		System.out.println("Avg : " + avg);

	}

	/**
	 * @param marks
	 * @return
	 */
	private static float getAverageMarks(float[] marks) {
		float avg = 0.0f;
		float sum = 0.0f;
		for (float f : marks) {
			sum = sum + f;
		}
		avg = sum/marks.length;
		return avg;
	}

}
