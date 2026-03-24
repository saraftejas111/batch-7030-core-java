package com.tricky;

public class Person {

	int age;
	String name;

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	static void display() {
		System.out.println("static display of Parent");
	}

}
