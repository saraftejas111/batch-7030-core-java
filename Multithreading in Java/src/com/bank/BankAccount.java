package com.bank;

public class BankAccount {

	private double balance = 1000;

	public void withdraw(String userName, double amount) {

		if (balance >= amount) {

			System.out.println(userName + " withdrawal in process...");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			balance = balance - amount ;
			System.out.println(userName+" completed withdrwal");
			System.out.println("Remaining Balance = "+balance);
			

		} else {
			System.out.println("Insufficent Funds..");
		}
	}

}
