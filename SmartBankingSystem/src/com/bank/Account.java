package com.bank;

public abstract class Account implements Transaction {

	// why abstract : because account has 2 types 1) Savings 2) Current

	private int accountNumber;
	private String accountHolderName;
	private double availableBalance;

	public Account(int accountNumber, String accountHolderName, double availableBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.availableBalance = availableBalance;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}

	// deposit
	// withdraw

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			availableBalance += amount;
			System.out.println("Amt deposited success, current balance : " + availableBalance);
		} else {
			System.out.println("Invalid Depositing Amount");
		}

	}

	public abstract double calculateInterset();

	public void displayAccountInfo() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Holder Name : " + accountHolderName);
		System.out.println("Account Balance : " + availableBalance);
	}

}
