package com.logicals;

public class ReverseDigit {

	public static void main(String[] args) {

		int digit = 1234;

		int reversed = 0; // 4 3 2

		// System.out.println(digit%10);

		while (digit > 0) {

			reversed = (reversed * 10) + (digit % 10); // 4 3 2 1

			// System.out.println("reversed --> " + reversed);

			digit /= 10; // 1234 / 10 = 123

			// 123 / 10 = 12

			// 12 / 10 = 1

		}
		System.out.println("\nreversed --> " + reversed);
	}
}
