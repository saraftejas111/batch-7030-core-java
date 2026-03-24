package com.exp;

public class Demo {

	public static void main(String[] args) {

		try {
			System.out.println("hello world..");
		} catch (Exception e) {

		}

		// code..
		// & semicolon error will adjust

		try {
			Class.forName("com.exp.Driver");
			System.out.println("class found..");

		} catch (Exception e) {

			System.out.println("aisa koi class hi nahi hain");
		}

		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);

			int[] arr = { 6, 7, 8 };
			System.out.println(arr[2]);

			System.out.println(4);

			String str = "java";

			System.out.println(str.charAt(5));

			System.out.println(5);

		} catch (ArithmeticException e) {
			System.out.println("try me arithmetic aya");
			// e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("try me array index ka error aya");
			// e.printStackTrace();
		} catch (Exception e) {
			System.out.println("try me koi to error aya");
			e.printStackTrace();
		} finally {
			System.out.println("me finally block hu re");
		}
	}
}
