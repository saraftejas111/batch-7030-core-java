package com.loops;

public class FindEvenOdd {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			if (i % 2 != 0) {
				System.out.println("odd --> " + i);
			} else {
				System.out.println("even --> " + i);

			}
		}
	}
}
