package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseOpt {

	public void insertEmployeeStmt(String name, String role, double salary) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7037jdbc", "root", "root");

		Statement stmt = con.createStatement();

		String query = "INSERT INTO employees (name , role , salary ) VALUES ('" + name + "' , '" + role + "', "
				+ salary + ")";

		int rows = stmt.executeUpdate(query);

		if (rows > 0) {
			System.out.println("Employee Added Successfully...");
		} else {
			System.out.println("Employee Not Added...");
		}
	}

	public void insertEmployeePStmt(String name, String role, double salary) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7037jdbc", "root", "root");

		String query = "INSERT INTO employees (name , role , salary ) VALUES (? , ? , ?)";

		PreparedStatement pstmt = con.prepareStatement(query);

		pstmt.setString(1, name);
		pstmt.setString(2, role);
		pstmt.setDouble(3, salary);

		int rows = pstmt.executeUpdate();

		if (rows > 0) {
			System.out.println("Employee Added Successfully using PreparedStatement...");
		} else {
			System.out.println("Employee Not Added...");
		}
	}

	public static void main(String[] args) throws Exception {

		DatabaseOpt db = new DatabaseOpt();

		// db.insertEmployeeStmt("Tina Sharma", "tester", 123456);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name : ");
		String name = sc.nextLine() ; 
		System.out.println("Enter Role : ");
		String role = sc.next();
		System.out.println("Enter Salary : ");
		double salary = sc.nextDouble();

		db.insertEmployeePStmt(name, role, salary);

	}
}
