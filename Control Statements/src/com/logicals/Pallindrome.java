package com.logicals;

public class Pallindrome {

	public static void main(String[] args) {

		int num = 12321; // pallindrome

		int copy = num;

		int rev = 0;

		while (num > 0) {
			rev = (rev * 10) + (num % 10);
			num /= 10;
		}
		if (rev == copy) {
			
			System.out.println("Pallindrome");
			
		} else {
			
			System.out.println("Not Pallindrome");

		}
	}
}
