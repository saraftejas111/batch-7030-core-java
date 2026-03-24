package com.obj;

import java.io.Serializable;

public class Employee implements Serializable {

	int id;
	String name;
	double salary;
	transient int lockerPassword;  // transient keyword is used to prevent the field from being serialized

	public Employee(int id, String name, double salary, int lockerPassword) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.lockerPassword = lockerPassword;
	}

	@Override
	public String toString() {
		return "Employee [id = " + id + ", name = " + name + ", salary = " + salary + ", lockerPassword = "
				+ lockerPassword + "]";
	}

}
