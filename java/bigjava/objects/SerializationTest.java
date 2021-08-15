package com.pawanchoure.bigjava.objects;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.io.EOFException;
import java.io.FileNotFoundException;

public class SerializationTest {
	void writeO() { // Writing Object in form of Bytes (serialization)
		try {
			FileOutputStream testFile = new FileOutputStream("test.txt");
			// passing FileOuputStream object into ObjectOutputStream
			ObjectOutputStream outputOStream = new ObjectOutputStream(testFile);
			String[] str1 = { "Hi", "Hello", "Hey", "Hola", "wazup" };
			int[] nums = { 5, 15, 25, 25, 36 };
			outputOStream.writeObject(str1);
			outputOStream.writeObject(nums);
			outputOStream.flush();
			outputOStream.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e);
		} catch (IOException e) {
			System.err.println("Write error: " + e);
		}
	}

	void readB() { // Reading Bytes and converting and recreating Object.
		try {
			FileInputStream itestFile = new FileInputStream("test.txt");
			// passing FileInputStream Object into ObjectInputStream
			ObjectInputStream inputOStream = new ObjectInputStream(itestFile);
			String[] str1 = (String[]) inputOStream.readObject();
			int[] nums = (int[]) inputOStream.readObject();
			System.out.println(Arrays.toString(str1));
			System.out.println(Arrays.toString(nums));
			inputOStream.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e);
		} catch (EOFException e) {
			System.err.println("End of stream: " + e);
		} catch (IOException e) {
			System.err.println("Read error: " + e);
		} catch (ClassNotFoundException e) {
			System.err.println("Class not found: " + e);
		}
	}

	public static void main(String... args) {
		SerializationTest t1 = new SerializationTest();
		t1.writeO();
		t1.readB();
	}

}
