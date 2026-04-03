package com.bank;

public class Bank {

	public static void main(String[] args) {

		Account ac = new Account();

		ac.accountNumber = 12345;
		ac.accountHolderName = "Tejas Saraf";
		ac.balance = 1500;

		ac.display();
		System.out.println("-----------------------------");
		ac.withdraw(3300);
	}
}
