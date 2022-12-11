package com.demo1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;
//Insert the Student Data Using Statement
public class Demo_1 {

	

   public static void main(String[] args) throws SQLException {
		
		try {
			//sql query
			String sql= "insert into class9(student_rollNo,student_name,student_city) values('5','vimal','udgir')";
			
			//add the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//make the connection(url,hostname ,db name, UN, pwd)
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");		
		    
            java.sql.Statement stmt=con.createStatement();
            
            stmt.execute(sql);
            
            System.out.println("record inserted succuessfuly");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
