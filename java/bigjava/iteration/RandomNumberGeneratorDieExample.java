package com.pawanchoure.bigjava.iteration;

public class RandomNumberGeneratorDieExample {

	public static void main(String[] args) {
		Die d = new Die(6);
		final int TRIES = 10;
		for (int i = 1; i <= TRIES; i++) {
			int n = d.cast();
			System.out.print(n + " ");
		}
	}

}
