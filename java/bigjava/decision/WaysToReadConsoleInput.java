package com.pawanchoure.bigjava.decision;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WaysToReadConsoleInput {

	public static void main(String[] args) {

		System.out.println("Enter Your Name : ");
		withBufferedReader();
		withConsole();
		withScanner();

		
	}

	private static void withScanner() {
		Scanner scanner= new Scanner(System.in);
		String name=scanner.nextLine();
		System.out.println("Scanner Class :Name entered : " + name);
		scanner.close();
	}

	/**
	 * Example to Read Input via java.io.console which is introduced in JDK 1.6
	 * It doesnt work in IDE and its a known bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=122429
	 * 
	 */
	private static void withConsole() {
		Console console = null;
		String name = null;
		try {
			// creates a console object
			console = System.console();

				// read line from the user input
			if(console!=null){
			   name = console.readLine("User Name? ");
				//name = console.readLine();
				// prints
				System.out.println(" Console IO :Name entered : " + name);
			}
				

		} catch (Exception ex) {

			// if any error occurs
			ex.printStackTrace();
		}

		
	}

	private static void withBufferedReader() {
		try {
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			String name = bufferRead.readLine();
			System.out.println("BufferedReader Class :Name entered : " + name);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
