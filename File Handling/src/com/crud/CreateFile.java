package com.crud;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {

		File file = new File("data.xlsx");

		// boolean newFile = f.createNewFile();

		if (file.createNewFile()) {

			System.out.println("File Created Successfully..");

		} else {
			System.out.println("File Already Exist..");

		}

	}
}
