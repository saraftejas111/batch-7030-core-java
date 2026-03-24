package com.inherit;

public class TestCar {

	public static void main(String[] args) {

		Tata t = new Tata();
		System.out.println(t.year); // 2026
		t.engine();
		t.airbags();
		t.model();
		t.seats();
		System.out.println("------------------------------");
		Mahindra m = new Mahindra();
		System.out.println(m.year); // 2026
		m.engine();
		m.airbags();
		m.model();
		m.seats();
	}
}
