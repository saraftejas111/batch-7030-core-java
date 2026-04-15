package com.test;

import com.ride.BookRide;

public class TestApp {

	public static void main(String[] args) {

		BookRide br1 = new BookRide("name", "source", "destination", "cab-type");

		int otp = br1.getOTP() ; 	
		
		 //br1.bookCab();
		// ride booked.. successfully... otp is 1234

		//br1.cancelRide(); // success..ride can only be cancel before start

		 br1.startRide(otp);

		// br1.cancelRide(); // failed..ride already started.. cannot be cancel

		// br1.calculateBill() ; // bill exceed 200 to 10% discount

	  // bill should be calculated on cab-type per km charges and km should
		// be fixed of 

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
