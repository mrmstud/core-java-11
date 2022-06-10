package com.java8learn.codingInterview.arrays;

public class TwoDimensionalMultiplicationMatrix {

	public static void main(String[] args) {

		int[][] matrix1 = { { 2, 4, 6 }, { 3, 5, 7 } };

		int[][] matrix2 = { { 3, 6, 9 }, { 2, 4, 6 } };

		int[][] resultMatrix = new int[2][3]; // to hold results

		resultMatrix = multipleTwoDimensionMatrix(matrix1, matrix2);

		for (int i = 0; i < resultMatrix.length; i++) {//rows
			for (int j = 0; j < resultMatrix[i].length; j++) { //columns within row
				System.out.print(resultMatrix[i][j] + " ");
			}
			System.out.println("");
		}

	}

	private static int[][] multipleTwoDimensionMatrix(int[][] matrix1, int[][] matrix2) {
		int[][] resultMatrix = new int[2][3];
		for (int i = 0; i < matrix1.length; i++) { //rows
			for(int j=0;j<matrix1[i].length;j++) { //columns
				resultMatrix[i][j] = matrix1[i][j] * matrix2[i][j];
			}
		}
		return resultMatrix;
	}

}






