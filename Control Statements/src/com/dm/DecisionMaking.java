package com.dm;

public class DecisionMaking {

	// statement = lines or some specific instructions

	// Control Statements : to achieve control on result or execution of program we
	// use control statements

	public static void main(String[] args) {

		// decision making statements : if , if-else , else-if , nested

		int age = 15;

		// 1. if age is above or equal to 18 = Allowed to Vote..! = only if

		if (age >= 18) {
			System.out.println("Allowed to Vote..!");
		}

		double balance = 1500;

		// 1. if available balance >= price of the product : Buyed Success
		// 2. otherwise show : insuffient funds == if-else

		if (balance >= 2000) {
			System.out.println("Buyed Success");
		} else {
			System.out.println("insuffient funds");

		}

		// ..... marks = 92 ;

		// if marks >= 90 : A grade

		// if marks >= 80 : B grade

		// if marks >= 70 : C grade

		// if marks >= 60 : D grade

		// if not matched to any : Fail

		// any one among this grade should be alloted to std

		// more than 2 conditions & any 1 should be printed

		int marks = 52;

		if (marks >= 90) {
			System.out.println("A Grade");
		} else if (marks >= 80) {
			System.out.println("B Grade");
		} else if (marks >= 70) {
			System.out.println("C Grade");
		} else if (marks >= 60) {
			System.out.println("D Grade");
		} else {
			System.out.println("Fail");
		}

		int aged = -25;

		if (aged >= 18) {

			if (aged > 110) {
				System.out.println("invalid age");
			} else {
				System.out.println("Allowed to Vote...");
			}

		} else {

			if (aged > 0) {
				System.out.println("Not Allowed to Vote...");
			} else {
				System.out.println("invalid age");

			}

		}
	}
}
