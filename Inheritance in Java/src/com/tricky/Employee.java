package com.tricky;

public class Employee extends Person {

	public Employee(int age, String name) {
		super(age, name);
		
	}
	@Override
	static void display() {
		System.out.println("static display of Child");
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee(101, "raj");
		
		e.display();
	}
}
