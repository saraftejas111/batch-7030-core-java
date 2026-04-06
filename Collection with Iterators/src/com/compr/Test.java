package com.compr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.entity.Employee;

public class Test {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();

		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("orange");

		System.out.println("fruits before sorting... ");
		fruits.forEach(System.out::println);

		Collections.sort(fruits); // compareTo

		System.out.println("\nfruits after sorting... ");
		fruits.forEach(System.out::println);

		List<Integer> nums = new ArrayList<>();

		nums.add(3);
		nums.add(1);
		nums.add(4);
		nums.add(2);
		nums.add(5);

		System.out.println("\nnums after sorting... ");

		Collections.sort(nums); // compareTo
		nums.forEach(System.out::println);

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

		System.out.println("\nemployees before sorting... ");
		employees.forEach(System.out::println);

		Collections.sort(employees); // compareTo

		System.out.println("\nemployees after default id sorting... ");
		employees.forEach(System.out::println);

		Collections.sort(employees, new NameComparator()); // compareTo

		System.out.println("\nemployees after name-comparator sorting... ");
		employees.forEach(System.out::println);

		Collections.sort(employees, new SalaryComparator()); // compareTo

		System.out.println("\nemployees after salary-comparator sorting... ");
		employees.forEach(System.out::println);

		Collections.sort(employees, new RoleComparator()); // compareTo

		System.out.println("\nemployees after role-comparator sorting... ");
		employees.forEach(System.out::println);

	}
}
//banana  =    98  
// apple   =    97  = 1
