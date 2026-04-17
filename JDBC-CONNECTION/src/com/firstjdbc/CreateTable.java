package com.firstjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7037jdbc", "root", "root");

		Statement st = cc.createStatement();

		st.execute(
				"CREATE TABLE employees (id INT PRIMARY KEY , name VARCHAR(45) , role VARCHAR(45) , salary double)");

		System.out.println("employees table created successfully...");

	}
}
