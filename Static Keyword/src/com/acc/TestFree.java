package com.acc;

public class TestFree {

	public static void main(String[] args) {

		Free f1 = new Free();
		f1.a = 10;
		f1.b = 20;
		f1.freeMovies();

		System.out.println("--------------------------");

		Free.freeMovies();

		System.out.println("--------------------------");

		Free f2 = new Free();
		f2.freeMovies();

	}
}
