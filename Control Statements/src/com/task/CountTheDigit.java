package com.task;

public class CountTheDigit {

	public static void main(String[] args) {
		
		int digit = 9498765 ; 
		
		int count = 0 ;
		
		while(digit > 0 ) {
			
			count++ ;
			
			digit /= 10 ;
		}
		
		System.out.println("count = "+count);
	}
}
