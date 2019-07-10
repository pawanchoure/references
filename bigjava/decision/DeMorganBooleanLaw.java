package com.pawanchoure.bigjava.decision;

import java.util.Scanner;

public class DeMorganBooleanLaw {

	public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	int amount=reader.nextInt();
	
	if ((0 < amount && amount < 1000))
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}

	if (!(0 < amount && amount < 1000))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	reader.close();
	}

}
