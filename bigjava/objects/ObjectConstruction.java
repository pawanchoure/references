package com.pawanchoure.bigjava.objects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ObjectConstruction {

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,
			CloneNotSupportedException, FileNotFoundException, IOException {

		// Creating Square Object

		// A. Using new keyword
		SquareObject square = new SquareObject(100, 100, 24);
		System.out.println("Square Object using new Keyword  X Co-ordinate : "
				+ square.getxCoordinate() + " Y Co-ordinate : "
				+ square.getyCoordinate() + " Size : " + square.getSize());

		// B. Using Class.forName()
		// If we know the name of the class & if it has a public default
		// constructor we can create an object in this way.
		SquareObject squareClassForName = (SquareObject) Class.forName(
				"com.pawanchoure.basic.SquareObject").newInstance();
		System.out.println("Square Object using Class.forName X Co-ordinate : "
				+ squareClassForName.getxCoordinate() + " Y Co-ordinate : "
				+ squareClassForName.getyCoordinate() + " Size : "
				+ squareClassForName.getSize());

		// C. Using clone()
		// The clone() can be used to create a copy of an existing object.
		SquareObject squareClone = (SquareObject) square.clone();
		System.out.println("Square Object using new clone  X Co-ordinate : "
				+ squareClone.getxCoordinate() + " Y Co-ordinate : "
				+ squareClone.getyCoordinate() + " Size : "
				+ squareClone.getSize());

		// D. Using object deserialization
		// Object deserialization is nothing but creating an object from its
		// serialized form.

		try {
			FileOutputStream SquareObject = new FileOutputStream("SquareObject.txt");
			ObjectOutputStream Os = new ObjectOutputStream(SquareObject);
			Os.writeObject(square);
			Os.flush();
			Os.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e);
		} catch (IOException e) {
			System.err.println("Write error: " + e);
		}

		ObjectInputStream inStream = new ObjectInputStream(new FileInputStream("SquareObject.txt"));
		SquareObject object = (SquareObject) inStream.readObject();
		System.out.println("Square Object using deserialization  X Co-ordinate : "
				+ object.getxCoordinate() + " Y Co-ordinate : "
				+ object.getyCoordinate() + " Size : "
				+ object.getSize());

	}

}
