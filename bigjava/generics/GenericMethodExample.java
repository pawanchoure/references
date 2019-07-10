package com.pawanchoure.bigjava.generics;

public class GenericMethodExample {

	public static void main(String[] args) {
		String[] stringArray= {"Pawan","Sachin","Ketan"};
		Double[] doubleArray= {1.0,2.0,3.0};
		print(stringArray);
		printGeneric(stringArray);
		printGeneric(doubleArray);
	}

	public static void print(String[] a) {
		for (String e : a) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	/**
	 * Generic Method That Prints the Array Result
	 * @param a
	 */
	public static<E> void printGeneric(E[] a) {
		for (E e : a) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
}
