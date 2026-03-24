package com.xyz;

import com.abc.Employee;

public class Employee3 {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.m1();
		// emp.m2();
		// emp.m3();
		// emp.m4();

		EmpChild ch = new EmpChild();
		ch.m2();

	}
}
