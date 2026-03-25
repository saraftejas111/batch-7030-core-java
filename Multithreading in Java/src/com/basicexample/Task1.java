package com.basicexample;

public class Task1 extends Thread{

	void task1() {
		for (int i = 1; i < 10; i++) {

			System.out.println("task1 ---> " + i);
		}
	}
	@Override
	public void run() {

		for (int i = 1; i < 10; i++) {

			System.out.println("task1 --> " + i);
		}
	}
}

// extends Thread class 

// write the code in overriden run method

// invoke the run method by calling start method
