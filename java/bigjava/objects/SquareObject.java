package com.pawanchoure.bigjava.objects;

import java.io.Serializable;
public class SquareObject implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int xCoordinate;
	private int yCoordinate;
	private int size;

	public SquareObject(int x, int y, int size) {
		this.xCoordinate = x;
		this.yCoordinate = y;
		this.size = size;
	}

	public SquareObject() {
		this.xCoordinate = 100;
		this.yCoordinate = 100;
		this.size = 100;
	}

	public int getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
