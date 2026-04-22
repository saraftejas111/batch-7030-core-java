package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class InstagramLogin {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7037jdbc", "root", "root");

		System.out.println("Enter Username : ");
		String username = sc.nextLine();

		System.out.println("Enter Password : ");
		String password = sc.nextLine();

//		Statement st = con.createStatement();
//
//		String query = "SELECT * FROM Igusers WHERE username = '" + username + "' AND password = '" + password + "'";
//
//		// 🔍 Print query for proof
//		System.out.println("\nGenerated Query:");
//		System.out.println(query);
//
//		ResultSet rs = st.executeQuery(query);

		String query = "SELECT * FROM Igusers WHERE username = ? AND password = ?";

		// 🔍 Print query for proof
		System.out.println("\nGenerated Query:");
		System.out.println(query);

		PreparedStatement pstmt = con.prepareStatement(query);

		pstmt.setString(1, username);
		pstmt.setString(2, password);

		 ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			System.out.println("Login Success...");
		} else {
			System.out.println("User not exist...");
		}

		sc.close();
		con.close();
	}
}