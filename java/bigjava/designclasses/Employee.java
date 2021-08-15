package com.pawanchoure.bigjava.designclasses;

public class Employee {

	private int Id;
	private String name;

	{
		name = "none";
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
