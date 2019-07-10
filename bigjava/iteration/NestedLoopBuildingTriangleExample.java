package com.pawanchoure.bigjava.iteration;

import java.util.Scanner;

public class NestedLoopBuildingTriangleExample {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the Max lines ");
		int lines=reader.nextInt();
		for (int i=0;i<lines;i++)
		{
			String r="";
			for (int j=0 ; j<=i;j++)
			{
				r+="[]";
			}
			System.out.println(r);
		}

	}

}
