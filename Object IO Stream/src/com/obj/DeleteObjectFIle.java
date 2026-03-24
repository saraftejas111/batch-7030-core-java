package com.obj;

import java.io.File;

public class DeleteObjectFIle {

	public static void main(String[] args) {

		String fileName = "employee.dat";

		File file = new File(fileName);

		if (file.delete()) {
			System.out.println("File Deleted Successfully..");
		} else {
			System.out.println("File Not Found..");

		}
	}
}
