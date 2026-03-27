package com.companylevel;

public class MultiThreadingOrderSystem {

    public static void main(String[] args) throws InterruptedException {

        Thread order1 = new Thread(new OrderProcessing("Order-101"));
        Thread order2 = new Thread(new OrderProcessing("Order-102"));
        Thread order3 = new Thread(new OrderProcessing("Order-103"));

        // Start all orders simultaneously
        order1.start();
        order2.start();
        order3.start();

        // Main thread waits for all orders
        order1.join();
        order2.join();
        order3.join();

        System.out.println("All orders processed successfully.");
    }
}
