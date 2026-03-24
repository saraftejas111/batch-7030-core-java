package com.override;

public class WhatsApp2012 extends WhatsApp2010 {

	@Override
	void message() {
		super.message();
		System.out.println("you can emojis....500 lines code");
	}
}

// super : by using super keyword we can call the objects of immidiate parent class