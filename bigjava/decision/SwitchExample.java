package com.pawanchoure.bigjava.decision;

import java.util.Scanner;

public class SwitchExample {

	/*
	 * Enum without explicit value works otherwise we need to create a seperate class.
	 */
	//private enum Options { APPLE, BALL };
	public static void main(String[] args) {

		System.out.println("Enter the Option \n 1. int \n 2. float \n 3. String \n 4. Char \n 5. Enum" );
		Scanner reader=new Scanner(System.in);
		int option=reader.nextInt();
		if(option==1)
			switchWithInt(reader);
		else if(option==2)
			swtichWithfloat(reader);
		else if(option==3)
			swtichWithString(reader);
		else if(option==4)
			swtichWithCharacter(reader);
		else if(option==5)
			swtichWithEnum(reader);
		
		

	}

	private static void swtichWithEnum(Scanner reader) {
		System.out.println("Enter your Option \n APPLE: APPLE \n BALL: BALL");
		EnumOptions option=EnumOptions.valueOf(reader.next());
		switch (option) {
		case APPLE:
			System.out.println("Option Name : " +option+" Option value : "+ option.name);
			break;
		case BALL:
			System.out.println("Option Name : " +option+" Option value :  "+ option.name);
			break;

		default:
			break;
		}
		
		
	}

	private static void swtichWithCharacter(Scanner reader) {
		System.out.println("Enter your Option \n A: Apple \n B: Ball");
		char inputOption=reader.next().charAt(0);
		switch (inputOption) {
		case 'A':
			System.out.println("Apple");
			break;
		case 'B':
			System.out.println("Ball");
			break;

		default:
			break;
		}
	}

	/*
	 * Introduced with Java 7 
	 */
	private static void swtichWithString(Scanner reader) {
		System.out.println("Enter your Option \n A: Apple \n B: Ball");
		String inputOption=reader.next();
		switch (inputOption) {
		case "A":
			System.out.println("Apple");
			break;
		case "B":
			System.out.println("Ball");
			break;

		default:
			break;
		}
		
	}

	private static void swtichWithfloat(Scanner reader) {
		System.out.println("Switch Doesnt Support Float");	
	}

	private static void switchWithInt(Scanner reader) {
		System.out.println("Enter your Option \n 1.0: Apple \n 1.1: Ball");
		int inputOption=reader.nextInt();
		switch (inputOption) {
		case 1:
			System.out.println("Apple");
			break;
		case 2:
			System.out.println("Ball");
			break;

		default:
			break;
		}
		
	}

}
