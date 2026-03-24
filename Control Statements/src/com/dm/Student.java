package com.dm;

public class Student {

	public static void main(String[] args) {

// control statements :
// statements which are use to control our programs execution or output.

		int marks = 52; // raj

//1. i only wannt to print PASS (1 condition) if marks >= 60 ;  -- only if

		if (marks >= 60) {
			System.out.println("RAJ PASS");
		}

//2. i want to print PASS / FAIL (2 condition) if marks >= 60 ;  -- if-else

		int markss = 92; // neha

		if (markss >= 60) {
			System.out.println("NEHA PASS");
		} else {
			System.out.println("NEHA FAIL");
		}

//3. i want to print GRADES (multiple condition)

		// if marks >= 90 "A" , if marks >= 80 "B" , // if marks >= 70 "C" ....

		// else-if  ladder

		int marksss = 82;

		if (marksss >= 90) {
			System.out.println("jay --> A");
		} else if (marksss >= 80) {
			System.out.println("jay --> B");
		} else if (marksss >= 70) {
			System.out.println("jay --> C");
		} else if (marksss >= 60) {
			System.out.println("jay --> D");
		} else {
			System.out.println("jay --> FAIL");
		}

		System.out.println("\n"); // gap

//4. if i want to apply condition after passing from 1 logic i will go with nested

		int balance = 1000;

		int amount = 2000;

		if (amount > 0) {

			System.out.println("amount valid..");

			if (balance >= amount) {
				System.out.println("yes you can withdraw..!");
			} else {
				System.out.println("sorry... you cannot withdraw");
			}
			
		} else {
			System.out.println("invalid amount");
		}

	}

}
