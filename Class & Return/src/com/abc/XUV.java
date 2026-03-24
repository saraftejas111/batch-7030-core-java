package com.abc;

public class XUV {

	void displayInfo() {
		
		Car c = new Car();
		
		c.engine = 2000 ; 
		c.name = "XUV";
		c.price = 2500000 ;
		
		System.out.println("Engine = "+c.engine);
		System.out.println("Name = "+c.name);
		System.out.println("Price = "+c.price);
	}
}
