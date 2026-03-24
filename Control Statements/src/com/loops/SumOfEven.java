package com.loops;

public class SumOfEven {

	public static void main(String[] args) {

		int sum = 0; // 2 , 6 , 12 , 20 , 30

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {
				sum = sum + i;
			}
		}

		System.out.println("Sum of Even --> " + sum);
	}
}
