package com.task;

public class TestEmployee {

	public static void main(String[] args) {

		Developer d = new Developer(101, "raj", 15000);

		System.out.println(d);

		d.calculateSalary();

		d.login(101);

		d.login("raj");

		System.out.println("\n---------------------------------------------\n");

		Manager m = new Manager(111, "Vikram Kapoor", 55000);

		System.out.println(m);

		m.calculateSalary();

		m.login(111);

		m.login("vikram");

	}
}
