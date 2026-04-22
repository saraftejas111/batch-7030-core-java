package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class SendMultipleUsers {

	public static int saveUser(Users user) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7037jdbc", "root", "root");

		PreparedStatement pst = con.prepareStatement("INSERT INTO Igusers (name, username , password) VALUES (?,?,?)");

		pst.setString(1, user.getName());
		pst.setString(2, user.getUsername());
		pst.setString(3, user.getPassword());
		int rows = pst.executeUpdate();
		return rows;

	}

	public static int saveMultipleUsers(List<Users> users) throws Exception {

		int rows = 0; // 1+1+1
		for (Users u : users) {
			rows += saveUser(u);
		}

		return rows;
	}

	public static void main(String[] args) throws Exception {

//		
//		int row = saveUser(new Users("jay", "jay123", "jay123"));
//
//		if (row > 0) {
//			System.out.println(row+" User added Successfully...");
//		} else {
//			System.out.println("Failed to Add User...");
//
//		}

		List<Users> listOfUsers = new ArrayList<>();

		listOfUsers.add(new Users("rina", "rina123", "rina123"));
		listOfUsers.add(new Users("sam", "sam123", "sam123"));
		listOfUsers.add(new Users("ram", "ram123", "ram123"));

		int rows = saveMultipleUsers(listOfUsers);

		if (rows > 0) {
			System.out.println(rows + " Users added Successfully...");
		} else {
			System.out.println("Failed to Add Users...");
		}

	}

}
