package com.task;

public class Employee {

	// encapsulation
	private int id;
	private String name;
	private double baseSalary = 20000;
	
	

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

}
