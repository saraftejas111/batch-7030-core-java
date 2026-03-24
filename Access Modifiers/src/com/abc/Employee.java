package com.abc;

public class Employee {

	// access modifier is concept in java which is used to restrict the scope of
	// objects
	// Public , Protected , default [no-modifier] , private
	
	// same class --> all can called
	// same package diff class --> private cannot called
	// diff package --> private,default cannot called
	
	// protected will work outside the package 
	// when we will call it by its child object
	
	// public will work anywhere inside the project

	public void m1() {
		System.out.println("public method");
	}

	protected void m2() {
		System.out.println("protected method");
	}

	 void m3() {
		System.out.println("default [no-modifier] method");
	}
	
	 private void m4() {
		System.out.println("private method");
	}

	 public static void main(String[] args) {
		
		 Employee emp = new Employee();
		 emp.m1();
		 emp.m2();
		 emp.m3();
		 emp.m4();
		 
	}
}
