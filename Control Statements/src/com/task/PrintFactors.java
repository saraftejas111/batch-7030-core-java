package com.task;

import java.util.Scanner;

public class PrintFactors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("check factors = ");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {

			if (N % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
