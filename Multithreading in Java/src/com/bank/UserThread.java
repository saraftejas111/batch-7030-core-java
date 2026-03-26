package com.bank;

public class UserThread extends Thread{

	private BankAccount bankAccount;

	private String userName;

	private double amount;

	public UserThread(BankAccount bankAccount, String userName, double amount) {
		super();
		this.bankAccount = bankAccount;
		this.userName = userName;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		
			bankAccount.withdraw(userName, amount);
		
	}
}
