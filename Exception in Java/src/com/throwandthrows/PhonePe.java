package com.throwandthrows;

public class PhonePe {

	private static double balance = 2000;
	private int pin = 1234;

	public void doPayment(double amount, int pin) throws InvalidPin {

		if (pin == 1234) {
			if (amount <= balance) {

				balance = balance - amount;

				System.out.println("Payment Success");
			} else {

				System.out.println("Insuffient Funds");

				throw new InsufficientFunds("Itna Paisa Nahi Hain...");
			}

		} else {
			
			throw new InvalidPin("Pin Galat Hain..");
			
			
		}
		// 1000...
		System.out.println("Thanks for Buying..");
	}

}
