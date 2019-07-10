package com.pawanchoure.bigjava.decision;

public class CompareFloatingPoint {
	
	public static void main(String[] args) {
		final double EPSILON = 1E-14;
		double r = Math.sqrt(2);
		double d = r * r - 2;
		if (d == 0)
			System.out.println("sqrt(2) squared minus 2 is 0");
		else
			System.out.println("sqrt(2) squared minus 2 is not 0 but " + d);

		
		if (Math.abs(r - d) <= EPSILON)
			System.out.println("sqrt(2) squared minus 2 is approximatelty equal 0");
		
	}

}

/*
  Even though the laws of mathematics tell us that equals 0, this program
   fragment prints
   sqrt(2) squared minus 2 is not 0 but 4.440892098500626E-16
 */
