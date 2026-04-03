package com.setstudy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.liststudy.Employee;

public class Emps {

	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "Raj", 12345);
		Employee emp2 = new Employee(102, "Neha", 12345);

		List<Employee> employees = new ArrayList<>();

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp1);
		
		System.out.println("****** list result ******");
		for (Employee e : employees) {
			System.out.println(e);
		}
		
		System.out.println("\n****** result after converting list to set******");
		Set<Employee> empSet = new HashSet<>(employees);
		
		for (Employee e : empSet) {
			System.out.println(e);
		}
	}
}
