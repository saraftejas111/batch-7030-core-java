package com.acc;

public class Employee {

	{
		System.out.println("hello i am instance block1");
	}
	

	static{
		System.out.println("****hello i am static block1****");
	}
	
	
	static void hello() {
		System.out.println("hello method..");
	}

}
