package com.shop;

import java.util.Scanner;

public class Shopping {

	private double eleGst(double e1, double e2) {

		double elegst = (e1 + e2) + ((e1 + e2) * 0.18);

		return elegst; // e1+e2+ 18%gst = 236

	}

	private double foodGst(double f1, double f2) {

		double fgst = (f1 + f2) + ((f1 + f2) * 0.07);
		return fgst; // e1+e2+ 7%gst = 214
	}

	private double clothGst(double c1) {

		return (c1 + (c1 * 0.22)); // c1 + 22%gst = 122
	}

	private double totalBillWithGST(double e1, double e2, double f1, double f2, double c1) {

		double tBillWithGST = eleGst(e1, e2) + foodGst(f1, f2) + clothGst(c1);

		return tBillWithGST; // all totalWithGST
	}

	public void calculateDiscountedBill(double e1, double e2, double f1, double f2, double c1) {

		double tbillGST = totalBillWithGST(e1, e2, f1, f2, c1);

		String check = (tbillGST > 1000) ? "A" : (tbillGST > 500) ? "B" : "C";

		switch (check) {
		case "A":

		{
			double discount = tbillGST * 0.20;

			double finalBill = tbillGST - discount;

			System.out.println("Total Bill With GST : " + tbillGST);
			System.out.println("20 % of the total bill : " + discount);
			System.out.println("After discount of 20% finall Bill  : " + finalBill);
		}

			break;

		case "B": {
			double discount = tbillGST * 0.10;

			double finalBill = tbillGST - discount;

			System.out.println("Total Bill With GST : " + tbillGST);
			System.out.println("10 % of the total bill : " + discount);
			System.out.println("After discount of 20% finall Bill  : " + finalBill);
		}

			break;

		default: {
			double discount = tbillGST * 0.05;

			double finalBill = tbillGST - discount;

			System.out.println("Total Bill With GST : " + tbillGST);
			System.out.println("5 % of the total bill : " + discount);
			System.out.println("After discount of 20% finall Bill  : " + finalBill);
		}
			break;
		}

	}

	public void doPayment() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter payment mode..");
		System.out.println("1. UPI Payment\n2. Card payment\n3.Cash On Delivery");

		int mode = sc.nextInt();

		switch (mode) {
		case 1:

			System.out.println("Enter UPI Pin : ");

			int pin = sc.nextInt();

			if (pin > 999 && pin < 10000) {
				System.out.println("payment success.. thanks for shopping..");
			} else {
				System.out.println("invalid pin");
			}

			break;

		case 2:

			System.out.println("Enter Card number : ");

			int card = sc.nextInt();

			if (card > 999 && card < 10000) {
				System.out.println("payment success.. thanks for shopping..");
			} else {
				System.out.println("invalid card number");
			}

			break;

		case 3:

			System.out.println("Enter Pincode : ");

			int pincode = sc.nextInt();

			if (pincode > 4000 && pincode < 5000) {
				System.out.println("pincode is deliverable.. thanks for shopping..");
			} else {
				System.out.println("invalid pincode, not servicable");
			}

			break;

		default:

			System.out.println("Invalid Selection..");
			break;
		}

	}

}
