package com.bank;

public class Account {

	int accountNumber ; 
	String accountHolderName ; 
	double balance ; 
	
	void display() {
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Name : "+accountHolderName);
		System.out.println("Available Balance : "+balance);
		
	}
	                        // 300
	void withdraw (double amount) {
		
		if (balance >= amount) {
			
			// 1200 =  1500   -  300  ; 
			balance = balance - amount ; 
			
			System.out.println("balance after withdraw : "+balance);
			
		} else {

			System.out.println("Insufficient Funds");
		}
	}
}
