package com.firstjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectToMySQL {

	public static void main(String[] args) throws Exception {

		// String : mandatory, jar included in JRE

		// data types , static , access modifiers , array etc : mandatory, jar included
		// in JRE

		// without this java code cannot be performed...

		// but :
		// No MySQL or db needed mandatorily to run java code : jar files are not
		// included in JRE

		// but if you want to connect MySQL or db you need to add their java supported
		// jar files explicitly

		// right click on project --> build path --> configure build path --> libraries

		// select classpath, select add external jars locate to your jar file & select
		// it, then apply and apply & close

		String dbURL = "jdbc:mysql://localhost:3306/";

		String dbname = "batch7037jdbc";

		String username = "root";

		String password = "root";

		String query = "CREATE DATABASE " + dbname;
		
		String str = "java" ; 
		
		// -----------------------------------------------------------------

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection(dbURL, username, password);

		Statement st = c.createStatement();

		st.execute(query);

		System.out.println(dbname + " ---> Database created Successfully..");

	}
}
