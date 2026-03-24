package com.statmethods;

public class DigitCount {

	public static void main(String[] args) {
		
		int num = 223355 ; 
		int count = 0 ;
		
		while(num > 0 ) {
			
			count++ ;
			
			num /= 10 ;
			
		}
		
		System.out.println("digits = "+count);
	}
}
