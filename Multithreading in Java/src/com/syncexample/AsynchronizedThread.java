package com.syncexample;

public class AsynchronizedThread extends Thread {

	AsynchronizedEx asyncex;

	public AsynchronizedThread(AsynchronizedEx asyncex) {
		super();
		this.asyncex = asyncex;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 1000; i++) {

			asyncex.counter();
		}
	}
}
