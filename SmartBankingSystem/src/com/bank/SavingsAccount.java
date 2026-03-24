package com.bank;

public class SavingsAccount extends Account {

	private double rateOfInterest = 0.04;

	public SavingsAccount(int accountNumber, String accountHolderName, double availableBalance) {
		super(accountNumber, accountHolderName, availableBalance);
	}

	@Override
	public void withdraw(double amount) {

		if (amount > 0) {

			if (amount < getAvailableBalance()) {

				double balance = getAvailableBalance() - amount;

				setAvailableBalance(balance);

				System.out.println("Amount withdrawal Successfull, Avaialble Balance : " + getAvailableBalance());
			} else {
				System.out.println("Insuffient Funds");
			}
		} else {

			System.out.println("Invalid Amount");
		}

	}

	@Override
	public double calculateInterset() {
		double balanceWithInterest = getAvailableBalance() + (getAvailableBalance() * rateOfInterest);
		setAvailableBalance(balanceWithInterest);
		System.out.println("Balance after adding interest : " + balanceWithInterest);
		return balanceWithInterest;
	}

}
