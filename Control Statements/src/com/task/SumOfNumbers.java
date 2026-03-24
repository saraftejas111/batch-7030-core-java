package com.task;

public class SumOfNumbers {

	public static void main(String[] args) {

		int N = 5;

		int sum = 0; // 1 , 3 , 6 , 10 , 15

		for (int i = 1; i <= N; i++) {
			sum = sum + i;

		}
		System.out.println("sum = " + sum);
	}
}
