package com.companylevel;

public class OrderProcessing implements Runnable {

	private String orderId;

	// Common lock object for packing (only one thread allowed)
   // private static final Object packingLock = new Object();

	public OrderProcessing(String orderId) {
		this.orderId = orderId;
	}

	@Override
	public void run() {
		try {
			processOrder();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void processOrder() throws InterruptedException {
		System.out.println("Processing order: " + orderId);

		paymentProcessing();
		packing(orderId);
		shipment();
	}

	private void paymentProcessing() throws InterruptedException {
		System.out.println(orderId + " - Payment processing started.");
		Thread.sleep(2000); // simulate delay
		System.out.println(orderId + " - Payment successful.");
	}

//    private void packing() throws InterruptedException {
//        synchronized (packingLock) { // only one thread at a time
//            System.out.println(orderId + " - Packing started.");
//            Thread.sleep(2000);
//            System.out.println(orderId + " - Packing completed.");
//        }
//    }

	private static synchronized void packing(String orderId) throws InterruptedException {
		System.out.println(orderId + " - Packing started.");
		Thread.sleep(2000);
		System.out.println(orderId + " - Packing completed.");
	}

	private void shipment() throws InterruptedException {
		System.out.println(orderId + " - Shipment started.");
		Thread.sleep(1500);
		System.out.println(orderId + " - Order shipped.");
	}
}
