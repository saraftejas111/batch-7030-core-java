package com.firstjdbc;

public class ConnectToMySQL {

	public static void main(String[] args) throws Exception {
		
		// String : mandatory, jar included in JRE
		
		// data types , static , access modifiers , array etc : mandatory, jar included in JRE
	
		// without this java code cannot be performed...
		
		// but : 
		// No MySQL or db needed mandatorily to run java code : jar files are not included in JRE
	
		// but if you want to connect MySQL or db you need to add their java supported jar files explicitly
		
		// right click on project --> build path --> configure build path --> libraries
		
		// select classpath, select add external jars locate to your jar file & select it, then apply and apply & close 
		
		System.out.println(1);
		
		Class.forName("com.mysql.cj.jdbc.Driver") ;
		
		System.out.println(2);
		
	}
}
