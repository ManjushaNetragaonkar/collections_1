package com.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo_3 {
public static void main(String[] args) throws SQLException {
		
		try {
			
			// add the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//make the connection(url,hostname, db name, Un, Pwd)
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
			
			String rollNO="7";
			String name="Rahul";
			String city="pune";
			PreparedStatement pps = connection.prepareStatement("insert into class9(student_rollNo,student_name,student_city) values(?,?,?)");
			pps.setString(1, rollNO );
			pps.setString(2, name);
			pps.setString(3, city);
		    pps.execute();
		    System.out.println("record inserted successfuly..");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
