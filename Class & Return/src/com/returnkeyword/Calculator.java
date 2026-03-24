package com.returnkeyword;

public class Calculator {

	int add(int a, int b) {

		int sum = a + b; // 1000 lines

		System.out.println("add = " + sum);

		return sum;
	}

	int average(int x, int y) {

		// int sum = a + b; // l000 lines repeat

		int sum = add(x, y);

		int avg = sum / 2;

		System.out.println("average = " + avg);

		return avg;
	}

	void calculatePercentage(int p, int q) {

		int avg = average(p, q);

		System.out.println("percent = " + avg + "%");
	}
}
