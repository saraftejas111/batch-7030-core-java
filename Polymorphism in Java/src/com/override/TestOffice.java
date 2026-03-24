package com.override;

public class TestOffice {

	public static void main(String[] args) {

		Manager manager = new Manager();
		manager.task();  // parent

		Developer dev = new Developer();
		dev.task();
		
		Tester tester = new Tester();
		tester.task();
	}
}
