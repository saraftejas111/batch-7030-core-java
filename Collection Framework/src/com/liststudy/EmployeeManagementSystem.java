package com.liststudy;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101, "Raj", 12345);
		Employee emp2 = new Employee(102, "Neha", 12345);
		
		Doctor doc1 = new Doctor(987, "Jay", "surgeon") ; 
		Doctor doc2 = new Doctor(654, "Tina", "dentist") ;
		
		List emplist = new ArrayList<>();
		
		emplist.add(emp1) ; 
		emplist.add(emp2) ; 
		
		emplist.add(doc1);
		emplist.add(doc2);
		
		
		for (Object object : emplist) {
			System.out.println(object);
		}
	}
}
