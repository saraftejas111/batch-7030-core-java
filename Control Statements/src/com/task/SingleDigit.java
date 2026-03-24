package com.task;

public class SingleDigit {

	public static void main(String[] args) {

		int num = 9875;

		while (num > 9) {

			int sum = 0;

			while (num > 0) {
				sum = sum + (num % 10);
				num = num / 10;
			}
			num = sum;
		}
		System.out.println("result --> "+num);
	}
}
