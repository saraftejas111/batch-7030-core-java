package com.throwandthrows;

public class Test {

	public static void main(String[] args) throws InvalidPin , ClassNotFoundException {
		
		PhonePe p = new PhonePe();
		
		p.doPayment(11200 , 1234);
	}
}
