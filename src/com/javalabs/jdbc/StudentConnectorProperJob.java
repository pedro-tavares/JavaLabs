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

public class StudentConnectorProperJob {

	private Connection connection;
	private Statement statement;
	private ResultSet rs;
	
	StudentConnectorProperJob() {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			this.connect();
			this.createStatement();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void connect() {
		// javalabs is database name, root is username and password  
		try {
			connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/javalabs",
				//+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", 
				"root", 
				"root123!");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
	}

	private void createStatement() throws SQLException {
		
		statement = connection.createStatement();
	}
	
	// SQL INSERT record 
	public void insertStudents() throws SQLException {

		statement.executeUpdate("INSERT INTO Student VALUES(\r\n"
				+ "	2,\r\n"
				+ "    \"Student 2 Name\",\r\n"
				+ "    \"Student 2 Surname\",\r\n"
				+ "    18\r\n"
				+ ");\r\n"
				+ "");
	}
	
	public void showStudents() throws SQLException {
		
		rs = statement.executeQuery("SELECT * FROM Student");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4));
			
		}		
	}

	public void showStudents(String firstName) throws SQLException {
		
		rs = statement.executeQuery("SELECT * FROM Student WHERE firstName=" + firstName);
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4));
			
		}		
	}
	
	public void deleteStudents() throws SQLException {
		statement.executeUpdate("DELETE FROM Student");	
	}
	
	public void close() throws SQLException {
		connection.close();
	}
	
	public static void main(String args[]) {
				
		StudentConnectorProperJob studentConnector = new StudentConnectorProperJob();
		try {
			
			System.out.println("Show Students:");
			studentConnector.showStudents();
			
			studentConnector.insertStudents();
			
			System.out.println("Show Students AFTER INSERT:");
			studentConnector.showStudents();
			
			studentConnector.deleteStudents();
			
			System.out.println("Show Students AFTER DELETE:");
			studentConnector.showStudents();
			

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}