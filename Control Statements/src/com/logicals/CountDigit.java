package com.logicals;

public class CountDigit {

	public static void main(String[] args) {

		int digit = 12378;

		int count = 0; // 1 2 3

		while (digit > 0) {

			count++;

			digit /= 10; // 123 / 10 = 12

			// 12 / 10 = 1
			// 1 /10 = 0000

		}

		System.out.println("count by while --> " + count);

		int num = 651723;

		int cnt = 0;

		for (int i = num; i > 0; i /= 10) {

			cnt++;

		}

		System.out.println("count by for --> " + cnt);
	}
}
