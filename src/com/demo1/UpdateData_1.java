package com.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Update record
public class UpdateData_1 {
public static void main(String[] args) throws SQLException {
	
	try {
		//add driver
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		//make connection(url,hostname,db name,UN,Pwd)
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
	
	
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}
}
