package com.exp;

public class TestConcept {

	public static void main(String[] args) {

		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3 / 0);
			System.out.println(4);
			System.out.println(5);

		} catch (Exception e) {
			System.out.println(6);
			try {
				System.out.println(7 / 0);
			} catch (Exception e2) {
				System.out.println(8);
				System.out.println(9);
			}
		} finally {	
			System.out.println(10);
		}
	}
}
