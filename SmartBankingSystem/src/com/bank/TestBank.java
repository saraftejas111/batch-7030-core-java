package com.bank;

public class TestBank {

	public static void main(String[] args) {
		System.out.println("******* Savings Banks Account info *****\n");
		Account savings = new SavingsAccount(1234, "raj patil", 2000);

		savings.displayAccountInfo();
		savings.calculateInterset();
		savings.deposit(1000);
		savings.withdraw(2500);

		System.out.println("\n******* Current Banks Account info *****\n");

		Account current = new CurrentAccount(5678, "tejas saraf", 5000);

		current.displayAccountInfo();
		current.calculateInterset();
		current.deposit(-2500);
		current.withdraw(5100);
		
	}
}
