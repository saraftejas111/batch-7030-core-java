package com.task;

public class Factorial {

	public static void main(String[] args) {

		int N = 5;

		int fact = 1;

		for (int i = 1; i <= N; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + N + " = " + fact);
	}
}
