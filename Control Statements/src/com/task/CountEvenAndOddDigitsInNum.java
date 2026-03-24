package com.task;

public class CountEvenAndOddDigitsInNum {

	public static void main(String[] args) {

		int num = 2345671;

		int even = 0;

		int odd = 0;

		while (num > 0) {
			
			int n = num % 10;
			
			if (n % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			num /= 10;
		}
		
		System.out.println("even = "+even);
		System.out.println("odd = "+odd);
	}

}
