package com.task;

public class Developer extends Employee {

	private double devSalary;

	public double calculateSalary() {

		double totalSalary = devSalary + getBaseSalary();

		System.out.println("Total salary (base + dev) = " + totalSalary);

		return totalSalary;
	}

	public Developer(int id, String name, double devSalary) {
		super(id, name);
		this.devSalary = devSalary;
	}

	public void login(int id) {
		if (this.getId() == id) {
			System.out.println("logged in success via id");
		} else {
			System.out.println("login failed, invalid id");

		}
	}
	
	public void login(String name) {
		if (this.getName().equalsIgnoreCase(name)) {
			System.out.println("logged in success via name");
		} else {
			System.out.println("login failed, invalid name");

		}
	}

	@Override
	public String toString() {
		return "Developer [Id = " + getId() + ", Name = " + getName() + ", Base Salary = " + getBaseSalary()
				+ ", Dev Salary = " + devSalary + "]";
	}

}
