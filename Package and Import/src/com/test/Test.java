package com.test;

import com.abc.Demo;

public class Test {

	public static void main(String[] args) {
		// Car c = new Car();

		Demo d = new Demo(); // abc
		d.good();
		// VVIMP
		com.xyz.Demo dd = new com.xyz.Demo(); // xyz
		dd.good();

		com.pqr.Demo ddd = new com.pqr.Demo();
		ddd.good();

	}
}
