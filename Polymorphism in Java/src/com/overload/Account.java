package com.overload;

public class Account {

	public void login(int mob) {
		System.out.println("logged in by mobile number...");
	}
	
	public void login(String email) {
		System.out.println("logged in by email address...");
	}
	
//	 int login(String email) {
//		System.out.println("logged in by email address...");
//	} 
	// only changing access modifiers & return type does allowes to overload the methods

}
