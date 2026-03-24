package com.crud;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {

//			String line1 = br.readLine();
//			String line2 = br.readLine();
//			String line3 = br.readLine();
//			System.out.println(line1);
//			System.out.println(line2);
//			System.out.println(line3);
			
			String line ;
			
			while((line = br.readLine()) != null) {
				
				System.out.println(line);
			}

		}
	}

}
