package com.crud;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateFile {

	public static void main(String[] args) throws IOException {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt" , true))) {

			bw.newLine();
			
			bw.write("4. Nikita Gaikwad..");

			System.out.println("lines are updated to file...");
		}

	}
}
