package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.entity.Employee;

public class TestApp {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Tejas Saraf", "developer", 70000);
		Employee e2 = new Employee(102, "Raj Patil", "tester", 32000);
		Employee e3 = new Employee(103, "Neha Sharma", "developer", 25000);
		Employee e4 = new Employee(104, "Jay Joshi", "tester", 44000);
		Employee e5 = new Employee(105, "Tina Basu", "developer", 53000);
		Employee e6 = new Employee(106, "Amit Kulkarni", "developer", 61000);
		Employee e7 = new Employee(107, "Pooja Mehta", "tester", 39000);
		Employee e8 = new Employee(108, "Rohan Desai", "manager", 90000);
		Employee e9 = new Employee(109, "Sneha Kapoor", "hr", 50000);
		Employee e10 = new Employee(110, "Vikram Singh", "ceo", 150000);

		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		employees.add(e9);
		employees.add(e10); // add() method is use to add or insert the data

		Employee emp = employees.get(0); // get() is use to get values by index

		System.out.println(emp);

		System.out.println(employees.get(9)); // alternate option to get data

		Employee updatedTejas = new Employee(101, "Tejas Saraf", "developer", 120000);

		employees.set(0, updatedTejas); // set method is use to update

		employees.add(new Employee(111, "Virat Kohli", "player", 123456));

		System.out.println("\n****** Show All Employees using for-loop ******");

		for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i));
		}

		employees.remove(e10); // remove() is used to delete the data
		employees.remove(employees.size() - 1); // index = size - 1 ;

		System.out.println("\n****** Show All Employees using enhance for ******");

		for (Employee e : employees) {

			System.out.println(e);

		}

		System.out.println("\n****** Show All Developers using enhance for ******");

		for (Employee e : employees) {
			if (e.getRole().equalsIgnoreCase("developer")) {
				System.out.println(e);
			}
		}

		System.out.println("\n****** Remove if Not Developers using enhance for ******");

		for (Employee e : employees) {
			if (e.getRole().equalsIgnoreCase("developer")) {
				continue;
			} else {
				// employees.remove(e); // Concurrent Modification Exception
			}
		}

		System.out.println("\n****** Learning Iterators ******");

		Iterator<Employee> itr = employees.iterator(); // [ 1, 2, 3, 4, 5, 6 , 7, 8, 9 ]
//
//		boolean result1 = itr.hasNext();
//		Employee first = itr.next();
//
//		boolean result2 = itr.hasNext();
//		Employee second = itr.next();
//
//		boolean result3 = itr.hasNext();
//		itr.next();
//		boolean result4 = itr.hasNext();
//		itr.next();
//		boolean result5 = itr.hasNext();
//		itr.next();
//		boolean result6 = itr.hasNext();
//		itr.next();
//		boolean result7 = itr.hasNext();
//		itr.next();
//		boolean result8 = itr.hasNext();
//		itr.next();
//		boolean result9 = itr.hasNext();
//		itr.next();
//		boolean result10 = itr.hasNext();
//
//		System.out.println("result1 --> " + result1 + " object --> " + first);
//		System.out.println("result9 --> " + result9);
//		System.out.println("result10 --> " + result10);

		System.out.println("\n****** Show All using Iterators ******");

//		while (itr.hasNext()) {
//			
//			Employee eee = itr.next();
//			System.out.println(eee);
//
//			System.out.println(itr.next());
//
//		}
		System.out.println("\nsize before removing --> " + employees.size());

		System.out.println("\n****** Remove if Not Developers using Iterator ******");

		while (itr.hasNext()) {

			Employee eee = itr.next();

			if (eee.getRole().equalsIgnoreCase("developer")) {
				continue;
			} else {
				itr.remove();
			}

		}

		System.out.println("\n****** List After removing ******");

//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}

		System.out.println("\nsize after removing --> " + employees.size());

		System.out.println("\n****** Iterate using forEach lamda ******");

		employees.forEach((e) -> { System.out.println(e); });

		System.out.println("\n****** Iterate using forEach :: ******");

		employees.forEach(System.out::println);
	}
}

/*
 * Today's Agenda : Collection Framework { DSA }
 * 
 * -- List , Set , Map : collection of data : read , write {add} , update ,
 * delete { CRUD }
 * 
 * -- Iterators : a tool which is used to get each particular data from
 * collection
 * 
 * for-loop {index}
 * 
 * foreach loop { enhance for loop }
 * 
 * forEach with lamda [ -> ] expression
 * 
 * *** Iterator *** ( mostly recommended & works with whole collection )
 * 
 * forward moving iterator :
 * 
 * 3 methods --> hasNext() , next() , remove() ;
 * 
 * ***ListIterator *** ( works only with List {I} impl classes )
 * 
 * forward & backword moving iterator
 * 
 * 9 methods --> next() , previous() , hasNext() , hasPrevious() , nextIndex()
 * ,previousIndex(), remove() , add() , set()
 */
