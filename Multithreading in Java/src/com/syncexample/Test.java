package com.syncexample;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		AsynchronizedEx asyncex = new AsynchronizedEx() ; 
		
		AsynchronizedThread str1 = new AsynchronizedThread(asyncex) ;		
		AsynchronizedThread str2 = new AsynchronizedThread(asyncex) ;
		
		str1.start();
		str2.start();
		
		str1.join();
		str2.join();
		
	
		System.out.println("result = "+asyncex.count);
		

	}

}
