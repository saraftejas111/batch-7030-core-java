package com.obj;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UpdateObjectFile {

	public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {

		File f1 = new File("employee.dat");
		File f2 = new File("temp.dat");

		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f1)));
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f2)));

		try {
			while (true) {
				Employee emp = (Employee) ois.readObject();

				if (emp.name.contains("Raj")) {
					emp.salary = 441122;
				}
				oos.writeObject(emp);
			}
		} catch (EOFException e) {
			System.out.println("--------- End of File ----------");
		}

		ois.close();
		oos.close();

		f1.delete();
		f2.renameTo(f1);

	}
}
