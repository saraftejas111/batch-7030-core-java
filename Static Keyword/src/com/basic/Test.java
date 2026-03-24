package com.basic;

public class Test {

	public static void main(String[] args) {

		Demo d1 = new Demo();
		d1.a += 3;
		d1.b += 4 ; 
		System.out.println("d1.a --> "+d1.a);
		System.out.println("d1.b --> "+d1.b);
		
		System.out.println("---------------------------------");
		
		Demo d2 = new Demo();
		d2.b += 3 ; 
		System.out.println("d2.a --> "+d2.a);
		System.out.println("d2.b --> "+d2.b);
	}
}
