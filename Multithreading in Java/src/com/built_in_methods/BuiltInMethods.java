package com.built_in_methods;

public class BuiltInMethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("main start..");
		
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		
		t1.setName("Tejas");
		t2.setName("Kiran");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	

		System.out.println("main end...  id = "+Thread.currentThread().getId()+" name = "+Thread.currentThread().getName());
	}
}
