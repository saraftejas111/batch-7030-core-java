package com.crud;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {

//		File file = new File("sample.txt");
//
//		FileWriter fw = new FileWriter(file);
//
//		BufferedWriter bw = new BufferedWriter(fw);
//
//		bw.write("1. Tejas Saraf");
//
//		bw.close();
//
//		System.out.println("lines are added to file...");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt"))) {

			bw.write("1. Tejas Saraf..");

			bw.newLine();

			bw.write("2. Jay Patil");

			bw.newLine();

			bw.write("3. Tina Yadav");

			System.out.println("lines are added to file...");
		}

	}
}
