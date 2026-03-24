package com.loops;

public class FindEven {

	public static void main(String[] args) {
		
	//	System.out.println(10 % 2); // remainder
		
	//	System.out.println(10 % 3); // 
		
		// num fully divisible by 2 is Even
		
		// jo num 2 ne purn bhag jato asa num even
		
		// num which is not fully divisible by 2 is Odd
		
		// o num 2 ne purn bhag nahi jat asa num Odd
		
		int i ; 
		
		for ( i = 1 ; i <= 10 ; i++) {
		
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("\nloop end --> "+i);
	}
}





