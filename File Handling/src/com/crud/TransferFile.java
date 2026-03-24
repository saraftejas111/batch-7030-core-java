package com.crud;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TransferFile {

	public static void main(String[] args) throws IOException {

		try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {

			BufferedWriter bw = new BufferedWriter(new FileWriter("student.dat"));

			String line;

			while ((line = br.readLine()) != null) {

				if (line.contains("Tina")) {
					bw.write("3. Tina Sharma");
				} else {
					bw.write(line);
				}

				bw.newLine();

			}
			bw.close();
		}
	}

}
