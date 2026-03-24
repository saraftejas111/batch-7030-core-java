package com.overload;

public class Student {

	void sum(int a, int b) {

		System.out.println("sum = " + (a + b));
	}

	void sum(int a, int b, int c) {

		System.out.println("sum = " + (a + b + c));
	}

	void sum(int a, int b, int c, int d) {

		System.out.println("sum = " + (a + b + c + d));
	}
}
