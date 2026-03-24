package com.loops;

public class SumOfEvenWhile {

	public static void main(String[] args) {

		int num = 1;

		int sumeven = 0;
		int sumodd = 0;

		while (num <= 10) {

			if (num % 2 == 0) {
				sumeven = sumeven + num;
			} else {
				sumodd = sumodd + num;
			}

			num++;
		}

		System.out.println("Sum of Even --> " + sumeven);
		System.out.println("Sum of Odd --> " + sumodd);
	}
}
