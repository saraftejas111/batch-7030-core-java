package com.loops;

public class RandomNumber {
    public static void main(String[] args) {

        int min = 1;
        int max = 24;

        int random = (int)(Math.random() * (max - min + 1)) + min;

        System.out.println("Random number: " + random);
    }
}
