package com.liststudy;

import java.util.ArrayList;

public class ListLearning {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList<>() ; 
		ArrayList ar2 = ar;
		ar2.add(1);
		ar2.add(12345.445);
		ar2.add("hello");
		ar2.add('@');
		ar2.add(true);
		ar2.add(null);
		ar2.add("hello");  // duplicate
		ar2.add(null);      // multiple null values
		System.out.println(ar2);
		ar2.add(333333);
		System.out.println(ar2);
		ar2.remove(5) ; 
		System.out.println(ar2);
		ar2.add(2, "tejas");
		System.out.println(ar2);
		
		for (int i = 0 ; i < ar2.size() ; i++) {   
			System.out.println(ar2.get(i));
		}
		
		System.err.println("------------------------------------");

		System.out.println(ar2.isEmpty());
		
		// ar.clear();
		
		// System.out.println(ar.isEmpty());
		
		System.out.println(ar.contains("raj"));
		


	}
}
//size() = returns the size of arraylist, means how many elements are there in list

// never create a class having name arraylist becausejava is also having arraylist class so it will get confuse

// as you can see the insertion order is followed..

// i can add elements , remove the elements 