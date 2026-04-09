package com.db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.entity.Employee;

public class Demo {

	public List<Employee> getAllEmployees() {
		Employee e1 = new Employee(101, "Tejas Saraf", "developer", 70000);
		Employee e2 = new Employee(102, "Raj Patil", "tester", 32000);
		Employee e3 = new Employee(103, "Neha Sharma", "developer", 25000);
		Employee e4 = new Employee(104, "Jay Joshi", "tester", 44000);
		Employee e5 = new Employee(105, "Tina Basu", "developer", 53000);
		Employee e6 = new Employee(106, "Amit Kulkarni", "developer", 110000);
		Employee e7 = new Employee(107, "Pooja Mehta", "tester", 39000);
		Employee e8 = new Employee(108, "Rohan Desai", "manager", 90000);
		Employee e9 = new Employee(109, "Sneha Kapoor", "hr", 50000);
		Employee e10 = new Employee(110, "Vikram Singh", "ceo", 150000);

		List<Employee> employees = new ArrayList<>();

		employees.add(e4);
		employees.add(e8);
		employees.add(e10);
		employees.add(e5);
		employees.add(e1);
		employees.add(e6);
		employees.add(e3);
		employees.add(e7);
		employees.add(e2);
		employees.add(e9);

		return employees;
	}

	public static void main(String[] args) {

		Demo d1 = new Demo();

		for (Employee emp : d1.getAllEmployees()) {
			System.out.println(emp);
		}
		
		Iterator<Employee> itr = d1.getAllEmployees().iterator();
		
		while (itr.hasNext()) {
			Employee employee =  itr.next();
			
			if (employee.getName().equals("Tejas Saraf")) {
				employee.setSalary(120000);
				System.out.println(employee);
			}
			
		}
		System.out.println("\n--------- After changing the salary -------------------------");
		for (Employee emp : d1.getAllEmployees()) {
			if (emp.getName().equals("Tejas Saraf")) {
				emp.setSalary(150000);
			}
			System.out.println(emp);
		}
		
		System.out.println("\n--------- After changing the salary -------------------------");
		for (Employee emp : d1.getAllEmployees()) {
			
			System.out.println(emp);
		}
		
	}

}
