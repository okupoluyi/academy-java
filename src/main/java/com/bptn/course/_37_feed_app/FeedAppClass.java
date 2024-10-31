package com.bptn.course._37_feed_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeedAppClass {

	private static final String userName = "postgres";
	private static final String password = "pg123";
	private static final String dbName = "bptn";
	private static final String port = "5433";
	private static final String dbUrl = "localhost";

	public Connection createConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName, userName,
					password);
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + " : " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
		return conn;
	}

	public void addUser(Connection conn, String firstName, String lastName, String username, String phone,
			String emailId, String password, boolean emailVerified) {
		PreparedStatement stmt = null;
		//String sql = "INSERT INTO \"User\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES ('Jason', 'Statham', 'jstatham', '647-678-9087','jasonstatham@gmail.com' , 'p@ssword', true, CURRENT_TIMESTAMP)";
		String sql = "INSERT INTO \"User\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
		try {
			// Create PreparedStatement
			stmt = conn.prepareStatement(sql);

			// Set values for the placeholders
			stmt.setString(1, firstName);
			stmt.setString(2, lastName);
			stmt.setString(3, username);
			stmt.setString(4, phone);
			stmt.setString(5, emailId);
			stmt.setString(6, password);
			stmt.setBoolean(7, emailVerified);

			// Execute the query
			int resultCount = stmt.executeUpdate();

			// Print result count
			System.out.println(resultCount + " record(s) inserted");
		} catch (SQLException ex) {
			// handle exception
			System.out.println("Exception: " + ex.getMessage());
		} finally {
			// Close the PreparedStatement in the finally block to ensure it is closed even
			// if an exception occurs
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					System.out.println("Exception while closing statement: " + e.getMessage());
				}
			}
		}
	}

	public boolean closeConnection(Connection conn) {
		boolean flag = true;
		try {
			conn.close();
		} catch (SQLException e) {
			flag = false;
			System.out.println("Exception: " + e.getMessage());
		}
		return flag;
	}

}
