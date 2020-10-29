/*
Schemas
Table

JDBC - Java Database Connectivity

 JDBC Interfaces
---------------
Driver interface
Connection interface
Statement interface
PreparedStatement interface
CallableStatement interface
ResultSet interface
ResultSetMetaData interface
DatabaseMetaData interface
RowSet interface

Statement 
---------
executeQuery
executeUpdate

JDBC Classes
------------
DriverManager class
Blob class
Clob class
Types class
*/
package com.javalabs.jdbc;

import java.sql.*;

public class StudentConnector {
	
	public static void main(String args[]) {
				
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/javalabs",
				//+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", 
				"root", 
				"root123!"); 
				// javalabs is database name, root is username and password  
			Statement statement = connection.createStatement();
			
			/*
			// INSERT 			
			statement.executeUpdate("INSERT INTO Student VALUES(\r\n"
					+ "	2,\r\n"
					+ "    \"Student 2 Name\",\r\n"
					+ "    \"Student 2 Surname\",\r\n"
					+ "    18\r\n"
					+ ");\r\n"
					+ "");
			*/
			
			// SELECT			
			ResultSet rs; 
			
			/*
			rs = statement.executeQuery("SELECT * FROM Student");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4));
				
			}
			*/
			
			rs = statement.executeQuery("SELECT * FROM Student WHERE firstName='Student 1 Name' ");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4));
				
			}
			
			// DELETE
			//statement.executeUpdate("DELETE FROM Student");
			
			
			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}