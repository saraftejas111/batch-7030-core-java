package com.statmethods;

public class Test {

	public static void main(String[] args) {

		Demo d1 = new Demo();
		d1.a = 10;
		d1.b = 20;
		d1.normalMethod();
		d1.staticMethod();
		System.out.println("-------------------------------------");
		Demo d2 = new Demo();

		d2.normalMethod();
		d2.staticMethod();
		
		Demo.staticMethod();
		Demo.staticMethod();
		Demo.staticMethod();
		Demo.staticMethod();

	}
}
