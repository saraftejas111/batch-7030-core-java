package com.built_in_methods;

public class Task1 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Task 1 ---> " + i + " tr id = " + Thread.currentThread().getId() + " name = "+ Thread.currentThread().getName());

		}
	}
}
