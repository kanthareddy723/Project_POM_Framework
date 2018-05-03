package com.TestCases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database_connection {

	public static void main(String[] args) throws SQLException
	{

		try {
			Class.forName("com.mysql.jdbc.Driver");
		
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "admin", "pass123");
			
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from emp");
			while(rs.next())
			{
				
				String val = rs.getInt(1)+" "+ rs.getString(2);
				System.out.println(val);
				
				
			}
		
		
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
