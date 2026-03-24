package com.acc;

public class TestStatic {
	
	static int a = 4 ; 

	
	public static void main(String[] args) {
		
		TestStatic.a++ ;   // 5
		                           // 5
		System.out.println(TestStatic.a++);  // a = 6
		
		// a = ??? 
		                           // 6
		System.out.println(TestStatic.a++); //a = 7 
		
		// a = ???
	}
}
