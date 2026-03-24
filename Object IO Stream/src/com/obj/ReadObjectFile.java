package com.obj;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectFile {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		String fileName = "employee.dat";

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));

		try {

			while (true) {
				Employee emp = (Employee) ois.readObject();
				System.out.println(emp);
			}

		} catch (EOFException e) {
			System.out.println("---------------- End of File ----------------");
		}

		ois.close();
	}
}
