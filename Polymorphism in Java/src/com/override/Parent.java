package com.override;

public class Parent {

	// access modifier : default 
	// return : String , name : hello : par : 1 String
	
	String hello(String name) {
		System.out.println("parent-hello " + name);
		return "hello-parent";
	}
}

/*
 * .......
 * 
 * -> Runtime Polymorphism { Method Overriding }
 * 
 * - concept of having same name, parameters, return type methods in parent and
 * child class.
 * 
 * - concept of involving more than 1 class. Parent-Child relation {inheritance}
 * must needed.
 * 
 * - if we want to achieve Method Overriding we must have to keep child class
 * method's access modifier same or greater than parent class {VVIMP}
 * 
 * - we can keep the same or increase the visibility of overridden methods but
 * we cannot reduce it.
 * 
 * - we can carry forward, update or modify the existing logic.
 * 
 * - Method Overriding Should be always check by @Override {VVIMP} annotation &
 * dynamic dispatch.
 * 
 * .......
 */