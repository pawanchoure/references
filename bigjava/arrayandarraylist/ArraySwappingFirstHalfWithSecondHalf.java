package com.pawanchoure.bigjava.arrayandarraylist;

import java.util.Arrays;

public class ArraySwappingFirstHalfWithSecondHalf {

	public static void main(String[] args) {
		double[] inputs = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Original Array : " +Arrays.toString(inputs) );
		for(int i=0, j=inputs.length/2;i<inputs.length && j <inputs.length;i++,j++){
			double temp=inputs[i];
			inputs[i]=inputs[j];
			inputs[j]=temp;	
		}
		System.out.println("AfterSwapping Array : " +Arrays.toString(inputs) );

	}

}
