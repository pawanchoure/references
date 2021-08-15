package com.pawanchoure.designpattern;

public class InterfaceExample {

}

interface Rollable {
	void roll(float degree);
}

class Circle implements Rollable {
	public void roll(float degree) {
		/* implement rolling functionality here */
	}
}


abstract class CircularShape implements Rollable { }

class test{}