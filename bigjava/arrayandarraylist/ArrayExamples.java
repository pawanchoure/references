package com.pawanchoure.bigjava.arrayandarraylist;

import java.util.Arrays;

public class ArrayExamples {

	public static void main(String[] args) {
		double[] doubleArray = { 1, 2, 3, 4 };
		double[] doubleArrayRefCopy = doubleArray;
		double[] doubleArrayTrueCopy = Arrays.copyOf(doubleArray,doubleArray.length);

		System.out.println("HashCode doubleArray : " + doubleArray.hashCode());
		System.out.println("HashCode doubleArrayRefCopy : "+ doubleArrayRefCopy.hashCode());
		System.out.println("HashCode doubleArrayTrueCopy : "+ doubleArrayTrueCopy.hashCode());

		if (doubleArray == doubleArrayRefCopy)
			System.out.println("== doubleArray &  doubleArrayRefCopy : " + true);
		else
			System.out.println("== doubleArray &  doubleArrayRefCopy : " + false);

		if (doubleArray == doubleArrayTrueCopy)
			System.out.println("== doubleArray &  doubleArrayTrueCopy : " + true);
		else
			System.out.println("== doubleArray &  doubleArrayTrueCopy : " + false);

		System.out.println("Equals doubleArray &  doubleArrayRefCopy : "+ doubleArray.equals(doubleArrayRefCopy));
		System.out.println("Equals doubleArray &  doubleArrayTrueCopy : "+ doubleArray.equals(doubleArrayTrueCopy));
		System.out.println("Equals doubleArray &  doubleArrayTrueCopy : "+ Arrays.equals(doubleArray, doubleArrayTrueCopy));
		
	}

}

/*

HashCode doubleArray : 366712642
HashCode doubleArrayRefCopy : 366712642
HashCode doubleArrayTrueCopy : 1829164700

== doubleArray &  doubleArrayRefCopy : true
== doubleArray &  doubleArrayTrueCopy : false

Equals doubleArray &  doubleArrayRefCopy : true
Equals doubleArray &  doubleArrayTrueCopy : false   its false since the hashcode is different
Equals doubleArray &  doubleArrayTrueCopy : true   using Arrays.equals for equality
 */
