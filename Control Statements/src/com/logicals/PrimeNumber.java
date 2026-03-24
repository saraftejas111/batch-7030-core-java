package com.logicals;

public class PrimeNumber {

	public static void main(String[] args) {

		// num which is only fully divisible by 1 & itself

		// fully divisible == remainder 0

//		System.out.println("Check Prime Number");
//
//		System.out.println("Enter the Number : ");
//
//		Scanner scanner = new Scanner(System.in);

		// int num = scanner.nextInt();

		int num = 7;

		int count = 0; // 2

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println(num + " is Prime Number");
		} else {
			System.out.println(num + " is Not Prime Number");

		}

		int num2 = 8;
		int cnt = 0;
		int start = 1;

		while (start <= num2) {

			if (num2 % start == 0) {
				cnt++;
			}

			start++;
		}
		if (cnt == 2) {
			System.out.println("prime check by while --> YES ");
		} else {
			System.out.println("prime check by while --> NOT PRIME ");

		}

//		System.out.println(7%1);
//		System.out.println(7%2);
//		System.out.println(7%3);
//		System.out.println(7%4);
//		System.out.println(7%5);
//		System.out.println(7%6);
//		System.out.println(7%7);

	}
}
