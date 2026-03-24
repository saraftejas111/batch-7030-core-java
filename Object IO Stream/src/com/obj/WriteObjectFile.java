package com.obj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Employee e1 = new Employee(101, "Raj Patil", 12345 , 1234);
		Employee e2 = new Employee(101, "Tina Sharma", 67899 , 1212);

		String fileName = "employee.dat";

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));

		oos.writeObject(e1);
		oos.writeObject(e2);

		oos.close();

		System.out.println("Objects are written Successfully..");

	}
}
