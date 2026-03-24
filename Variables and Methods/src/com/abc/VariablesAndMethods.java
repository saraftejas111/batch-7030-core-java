package com.abc;

public class VariablesAndMethods {

// 	int package = 11 ;  // java keywords are not allowed for creating variables, methods, class

	int def ; // default value works with only global variable
	
	int age = 25;   

	String name = "raj patil"; // this all are Global variables

	boolean active = true;    // access throughout the class

	void display() {
		System.out.println("AGE : " + age);
		System.out.println("NAME : " + name);
		System.out.println("STATUS : " + active);
	}

	void sum() {
		int a = 10; // local variable
		
		age = age + 5 ; 
		
		System.out.println(age);    

		int d = a + 6;

	}

	// int c = a + 5;   // local var can access within the block only

	void addition(int a , int b ) {  // local variable
		
		System.out.println("add : "+(a+b));
	}
	
	void wish(String name) {
		System.out.println("Hello "+name);
	}
}
