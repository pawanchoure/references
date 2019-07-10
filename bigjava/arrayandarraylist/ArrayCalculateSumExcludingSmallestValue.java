package com.pawanchoure.bigjava.arrayandarraylist;

/**
 * You are to compute the final quiz score, which is the sum of all scores after
 * dropping the lowest one. For example, if the scores are 8 7 8.5 9.5 7 4 10
 * then the final score is 50.
 * 
 * @author Pawan
 * 
 */
public class ArrayCalculateSumExcludingSmallestValue {

	public static void main(String[] args) {
		double[] inputs = { 8, 7, 8.5, 9.5, 7, 4, 10 };
		double smallest = inputs[0];
		int smallestPostion = 0;
		;
		// Orthodox Approach
		for (int i = 0; i < inputs.length; i++) {
			if (inputs[i] < smallest) {
				smallest = inputs[i];
				smallestPostion = i;
			}

		}
		// Adapting Algorithm
		for (int i = 0; i < inputs.length; i++) {
			if (inputs[i] < inputs[smallestPostion]) {
				smallestPostion = i;
			}

		}

	}

}
