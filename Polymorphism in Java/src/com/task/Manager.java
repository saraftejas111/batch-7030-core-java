package com.task;

public class Manager extends Employee {

	private double managerSalary;

	public Manager(int id, String name, double managerSalary) {
		super(id, name);
		this.managerSalary = managerSalary;
	}

	public double calculateSalary() {

		double totalSalary = managerSalary + getBaseSalary();

		System.out.println("Total salary (base + manager) = " + totalSalary);

		return totalSalary;
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
		return "Manager [Id = " + getId() + ", Name = " + getName() + ", Base Salary = " + getBaseSalary()
				+ ", Manager Salary = " + managerSalary + "]";
	}
}
