package com.pawanchoure.bigjava.arrayandarraylist;

public class ArrayPrintNoofPostiveNegativeValues {

	public static void main(String[] args) {
		double[] inputs = { 8, 7, -8.5, 9.5, 7, -4, 10 };
		int positive = 0, negative = 0;
		for (double d : inputs) {
			if (d > 0)
				positive++;
			else
				negative++;
		}
		System.out.println("Postive Count : "+positive + " Negative Count : "+negative);
	}

}
