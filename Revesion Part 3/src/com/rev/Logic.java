package com.rev;

public class Logic {

	// variables : a container which is used to store values
	// 2 types : instance(global) , local variables

	// Instance : are created inside the class & outside from the blocks
	// scope : it can be used or access anywhere inside the class
	// gets memory when the object of that class is created
	// default value if not initialized

	int a;

	// Local variable : are created inside the class & inside the blocks
	// scope : it can be used or access within the block only
	// gets memory when the method is called
	// local var do not have default value
	// must be initialized if want to use or access

// return      name      par   
	void greet() {

		int b;

		System.out.println("hello everyone.." + a);
		System.out.println("hello everyone..");
		System.out.println("hello everyone..");
		System.out.println("hello everyone..");
		System.out.println("hello everyone..");
		System.out.println("hello everyone..");
		System.out.println("hello everyone..");
		System.out.println("hello everyone..");
		System.out.println("hello everyone..");
		System.out.println("hello everyone..");

		// body
	}

	void info(String name, int age, String city) {
		System.out.println("name : " + name + a);
		System.out.println("age : " + age);
		System.out.println("city : " + city + b);
	}

	// return --> lifetime

	int sum(int a, int b) {
		int c = a + b; // 10 lines code
		System.out.println("sum =  " + c);
		return c ;
	}

	void average(int x, int y) {
//		int sum = x + y ;  // 10 lines code

	   int z = sum(x, y);

		int avg = z / 2;
		System.out.println("average = " + avg);
	}

}
