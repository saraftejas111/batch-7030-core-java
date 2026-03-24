package com.acc;

public class TestAccount {

	public static void main(String[] args) {

		MyAccount feb17 = new MyAccount();

		double credited_amount = 2500;

		feb17.balance += credited_amount;

		System.out.println("17 feb Balance = " + feb17.balance);

		MyAccount feb18 = new MyAccount();
		
		feb18.balance -= 300 ;

		System.out.println("18 feb Balance = " + feb18.balance);
	}
}
