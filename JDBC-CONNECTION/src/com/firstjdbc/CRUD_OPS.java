package com.firstjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUD_OPS {

	public static void main(String[] args) throws Exception {

//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7037jdbc", "root", "root");
//
//		Statement st = cc.createStatement();
//
//		int rows = st.executeUpdate(
//				"INSERT INTO employees (name , role , salary ) values ('Neha' , 'dev' , 123456) , ('Tina' , 'dev' , 123456) , ('Sam' , 'dev' , 123456)");
//
//		if (rows > 0) {
//			System.out.println(rows + " data added");
//		} else {
//			System.out.println("failed to add data");
//
//		}

//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7037jdbc", "root", "root");
//
//		Statement st = cc.createStatement();
//
//		int rows = st.executeUpdate("UPDATE employees SET name = 'rina varma' WHERE id = 3") ; 
//		if (rows > 0) {
//			System.out.println(rows + " data updated");
//		} else {
//			System.out.println("failed to update data");
//
//		}
//
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7037jdbc", "root", "root");
//
//		Statement st = cc.createStatement();
//
//		int rows = st.executeUpdate("DELETE FROM employees WHERE id > 3");
//		if (rows > 0) {
//			System.out.println(rows + " data deleted");
//		} else {
//			System.out.println("failed to delete data");
//
//		}

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7037jdbc", "root", "root");

		Statement st = cc.createStatement();

		ResultSet rs = st.executeQuery("SELECT * FROM employees");

		while (rs.next()) {

			System.out.print(rs.getInt(1) + "    ");
			System.out.print(rs.getString(2) + "    ");
			System.out.print(rs.getString(3) + "    ");
			System.out.print(rs.getDouble(4) + "    ");

			System.out.println();

		}

	}
}

// operation which doeas not returns anything in mysql do it with execute()

// operation which returns the rows affected nums in mysql do it with executeUpdate()

// because executeUpdate() has return type int and it returns the number of affected rows in mysql 

// operation which returns some rows or data like ( retrival or select ) are used with executeQUery()

// because executeQuery() returns the ResultSet

// we use ResultSet's next() to check weather the next e datantry or is availble or not

// if available then whith the help of syso, we print it 
