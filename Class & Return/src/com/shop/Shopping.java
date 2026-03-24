package com.shop;

public class Shopping {

	private double electricGST(double e1, double e2) {

		double eleGST = (e1 + e2) + (e1 + e2) * 0.18;

		return eleGST;
	}

	private double foodGST(double f1, double f2) {
		double foodGST = (f1 + f2) + (f1 + f2) * 0.10;

		return foodGST;
	}

	private double clothingGST(double c1, double c2) {
		double clothingGST = (c1 + c2) + (c1 + c2) * 0.15;
		return clothingGST;
	}

	private double totalBillWithGST(double e1, double e2, double f1, double f2, double c1, double c2) {
		double eleGST = electricGST(e1, e2);
		double foodGST = foodGST(f1, f2);
		double clothGST = clothingGST(c1, c2);

		double totalBill = eleGST + foodGST + clothGST;

		System.out.println("electrical + GST = " + eleGST);
		System.out.println("food + GST = " + foodGST);
		System.out.println("clothing + GST = " + clothGST);

		System.out.println("Total Bill with GST = " + totalBill);

		return totalBill;
	}

	public void discountedBill(double e1, double e2, double f1, double f2, double c1, double c2) {

		double totalBill = totalBillWithGST(e1, e2, f1, f2, c1, c2);

		double disc = totalBill * 0.20;

		System.out.println("applying 20% of discount....");

		System.out.println("YAY.... you have got discount of " + disc + " rs");

		System.out.println("Your Final Bill = " + (totalBill - disc));

		System.out.println("\nThank you for Shopping with us....!");
	}

	// use separate methods to calculate the GST for each

	// then calculate the total bill
}
