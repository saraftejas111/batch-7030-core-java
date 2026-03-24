package com.sc;

public class SwitchCase {

	public static void main(String[] args) {

		String day = "b";
		switch (day) {
		case "A":
			System.out.println("SUNDAY");
			break;
		case "B":
			System.out.println("MONDAY");
			break;
		case "C":
			System.out.println("TUESDAY");
			break;
		case "D":
			System.out.println("WEDNESDAY");
			break;
		case "E":
			System.out.println("THURSDAY");
			break;
		case "F":
			System.out.println("FRIDAY");
			break;
		case "G":
			System.out.println("SATURDAY");
			break;
		default:
			System.out.println("No such day available...\nrange(1 to 7)");
			break;
		}

	}
}
