package com.bank;

public class Test {
	
	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount() ; 
		
		UserThread utr1 = new UserThread(ba, "user-1", 700);
		UserThread utr2 = new UserThread(ba, "user-2", 700);
		
		utr1.start();
		utr2.start();

	}

}
