package com.javalabs.jdbc;

import java.sql.*;

public class StudentConnector {
	
	public static void main(String args[]) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/javalabs?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", 
				"root", 
				"root"); 
				// javalabs is database name, root is username and password  
			Statement statement = connection.createStatement();
			
			// SELECT
			/*
			ResultSet rs = statement.executeQuery("SELECT * FROM Student");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4));
				
			}
			*/
			
			// INSERT 
			/*
			statement.executeUpdate("INSERT INTO Student VALUES(\r\n"
					+ "	1,\r\n"
					+ "    \"Student 1 Name\",\r\n"
					+ "    \"Student 1 Surname\",\r\n"
					+ "    18\r\n"
					+ ");\r\n"
					+ "");
			*/
			// DELETE
			//statement.executeUpdate("DELETE FROM Student");
			
			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}