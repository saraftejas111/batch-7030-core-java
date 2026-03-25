package com.basicexample;

public class Task2 extends Person implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i < 10; i++) {

			System.out.println("task2 ==> " + i + " --- ");
		}
	}

	void task2() {
		for (int i = 1; i < 10; i++) {

			System.out.println("task2 ===> " + i + " --- ");
		}
	}
}

// implement the Runnable interface

// write the code in overriden run method

// convert the class into thread

//invoke the run method by calling start method


