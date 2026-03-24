package com.loops;

public class SumOEvenAndOdd {

	public static void main(String[] args) {

		int sumeven = 0; // 2 , 6 , 12 , 20 , 30
		int sumodd = 0;  // 1 , 4 , 9 , 16 , 25

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {
				sumeven = sumeven + i;
			}else {
				sumodd = sumodd + i ;
			}
		}

		System.out.println("Sum of Even --> " + sumeven);
		System.out.println("Sum of Odd --> " + sumodd);

	}
}
