package com.ecommerce.controller;

import java.util.Scanner;
import com.ecommerce.service.EcomService;
import com.ecommerce.model.User;

public class EcomController {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		EcomService service = new EcomService();

		System.out.print("Enter User ID: ");
		int id = sc.nextInt();

		System.out.print("Password: ");
		String pass = sc.next();

		User user = service.login(id, pass);

		if (user == null) {
			System.out.println("Invalid Login!");
			return;
		}

		System.out.println("Welcome " + user.getName());

		while (true) {
			System.out.println("\n1. View Products");
			System.out.println("2. Add to Cart");
			System.out.println("3. View Cart");
			System.out.println("4. Checkout");
			System.out.println("5. Exit");

			int ch = sc.nextInt();

			try {
				switch (ch) {

				case 1:
					service.showProducts();
					break;

				case 2:
					System.out.print("Product ID: ");
					int pid = sc.nextInt();

					System.out.print("Quantity: ");
					int qty = sc.nextInt();

					service.addToCart(pid, qty);
					break;

				case 3:
					service.viewCart();
					break;

				case 4:
					service.checkout(id);
					break;

				case 5:
					System.exit(0);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}