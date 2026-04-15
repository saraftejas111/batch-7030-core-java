package com.ride;

import java.util.Random;

public class BookRide {
	private String name;
	private String source;
	private String destination;
	private String cabtype;
	private boolean start = false;
	private int otp;

	public BookRide(String name, String source, String destination, String cabtype) {
		super();
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.cabtype = cabtype;

		System.out.println("Ride booked successfully..");
		Random rand = new Random();
		int otp = 1000 + rand.nextInt(9000); // ensures 4-digit
		System.out.println("OTP: " + otp);
		this.otp = otp;

	}

	public int getOTP() {
		return otp;
	}

	public void startRide(int otp) {

		if (otp == this.otp) {
			start = true;
			System.out.println("OTP is correct.. Ride started...");

		} else {
			System.out.println("wrong OTP");
		}
	}

	public void cancelRide() {
		if (!start) {
			System.out.println("ride is cancelled..");
		} else {
			System.out.println("ride already started.. cannot be cancelled..");

		}
	}

	public void calculateBill() {

	}

}
