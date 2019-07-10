package com.pawanchoure.bigjava.arrayandarraylist;

public class ArrayReferenceExample {

	public static void main(String[] args) {
		int[] intArray = {2,4,5};
		int[] intArray2=intArray;
		
		//Upadating value at intArray2[0]
		intArray2[0]=44;
		System.out.println(intArray[0]);
		System.out.println(intArray2[0]);
		
		//double[] doubleArray=intArray; cant do that
		
	}

}
