package com.bank;

public class CurrentAccount extends Account {

	private double overdraftLimit = 1000;

	// credit from bank to account on having 0 balance

	@Override
	public void withdraw(double amount) {
		if (amount > 0) {

			if (amount < getAvailableBalance() + overdraftLimit) {

				double balance = getAvailableBalance() - amount;

				setAvailableBalance(balance);

				if (balance < 0) {

					System.out.println("You used overdraft limit{1000rs}, Balance : " + getAvailableBalance());
				} else {

					System.out.println("Amount withdrawal Successfull, Avaialble Balance : " + getAvailableBalance());
				}
			} else {
				System.out.println("Insuffient Funds");
			}
		} else {

			System.out.println("Invalid Withdrawal Amount");
		}

	}

	public CurrentAccount(int accountNumber, String accountHolderName, double availableBalance) {
		super(accountNumber, accountHolderName, availableBalance);
	}

	@Override
	public double calculateInterset() {
		System.out.println("Current Account Has No Interest");
		return 0;
	}

}
