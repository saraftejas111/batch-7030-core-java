package com.bank.controller;

import java.util.Scanner;

import com.bank.dao.BankDAO;
import com.bank.model.Account;
import com.bank.service.BankService;

public class BankController {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		BankDAO dao = new BankDAO();
		BankService service = new BankService();

		while (true) {
			System.out.println("\n1. Create Account");
			System.out.println("2. Login");
			System.out.println("3. Exit");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				Account acc = new Account();

				System.out.print("Enter ID: ");
				acc.setId(sc.nextInt());

				sc.nextLine();

				System.out.print("Enter Name: ");
				acc.setName(sc.nextLine());

				System.out.print("Set Password: ");
				acc.setPassword(sc.next());

				System.out.print("Initial Balance: ");
				acc.setBalance(sc.nextDouble());

				dao.createAccount(acc);
				break;

			case 2:
				System.out.print("Enter ID: ");
				int id = sc.nextInt();

				System.out.print("Enter Password: ");
				String pass = sc.next();

				Account user = dao.login(id, pass);

				if (user != null) {
					System.out.println("Login Success!");

					service.showBalance(id); // 🔥 show after login

					while (true) {
						System.out.println("\n1. Deposit");
						System.out.println("2. Withdraw");
						System.out.println("3. Transfer");
						System.out.println("4. Show Balance");
						System.out.println("5. Logout");

						int opt = sc.nextInt();

						if (opt == 1) {
							System.out.print("Amount: ");
							service.deposit(id, sc.nextDouble());
							service.showBalance(id); // 🔥

						} else if (opt == 2) {
							System.out.print("Amount: ");
							try {
								service.withdraw(id, sc.nextDouble());
								service.showBalance(id); // 🔥
							} catch (Exception e) {
								System.out.println(e.getMessage());
							}

						} else if (opt == 3) {
							System.out.print("To ID: ");
							int toId = sc.nextInt();

							System.out.print("Amount: ");
							try {
								service.transfer(id, toId, sc.nextDouble());
								service.showBalance(id); // 🔥
							} catch (Exception e) {
								System.out.println(e.getMessage());
							}

						} else if (opt == 4) {
							service.showBalance(id);

						} else {
							break;
						}
					}
				} else {
					System.out.println("Invalid Credentials!");
				}
				break;

			case 3:
				System.out.println("Thank You For Using TKA Bank");
				System.exit(0);
			}
		}
	}
}