package com.opt;

public class Operators {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;
		int c = 2;

		System.out.println("***** 1. Arithmetic Operators *****");

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // java treats every num as int , do not include pointer values
		System.out.println(a % b); // % return remainder
		System.out.println(a % c);

		System.out.println("\n***** 2. Relational (Comparison) Operators *****");
		int d = 10;
		System.out.println(a == d);
		System.out.println(a != d);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println("both are false...");
		System.out.println(a >= d);
		System.out.println(a <= d);

		System.out.println("\n***** 3. Logical Operators *****");

		System.out.println((a > b) && (a >= d)); // true

		System.out.println((a < b) && (a >= d));

		System.out.println(a != b);

		System.out.println(a != d);

		System.out.println("\n***** 4. Assignment Operators *****");

		int e = 12;

		e += 2;

		System.out.println(e);

		e -= 5;

		System.out.println(e);

		System.out.println("\n***** 5. Unary Operators *****");

		int f = 15;

		System.out.println(-f);

		System.out.println(f);

		System.out.println(f++); // 15 and then ++ operation is applied (post increment)

		System.out.println(f); // 16

		System.out.println(++f); // 17 ++ operator is applied firstly (pre increment)

		System.out.println("\n***** 6. Ternary Operators *****");

		// (condition) ? true : false ;

		int marks = 60;

		String result = (marks >= 60) ? "Pass" : "Fail";

		System.out.println(result);

		boolean active = false;

		String status = (active) ? "Online" : "Offline";

		System.out.println(status);

	}
}
