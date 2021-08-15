package com.pawanchoure.bigjava.iteration;

import java.util.Random;

public class Die {

	private Random generator;
	private int sides;

	public Die(int s) {
		sides = s;
		generator = new Random();
	}

	/**
	 * Simulates a throw of the die.
	 * 
	 * @return the face of the die
	 */
	public int cast() {
		return 1 + generator.nextInt(sides);
	}
}
