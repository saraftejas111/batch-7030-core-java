package com.statover;

public class TestAnimal {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
		
		Animal d = new Dog() ; 
		d.sound();
		
		Animal c = new Cat();
		c.sound();
		

	}
}
// we cannot override static methods