package com.basicexample;

public class TestTasks {

	public static void main(String[] args) {
		
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		
		Thread tr2 = new Thread(t2) ;
		
	//	t1.task1();
	//	t2.task2();
		
		t1.start();
		tr2.start();
		
	}
}
