package com.crud;

import java.io.File;
import java.io.IOException;

public class DeleteFile {

	public static void main(String[] args) throws IOException {

		File file = new File("demo.dat");

		if (file.delete()) {
			System.out.println("File Deleted Successfully..");
		} else {
			System.out.println("File Not Found..");

		}

	}

}
