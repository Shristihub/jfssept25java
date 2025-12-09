package com.db.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsseptjava";
		String username = "root";
		String password = "root";
//		String sql = "create table employee(empname varchar(20),"
//				+ "emp_id int primary key,"
//				+ "city varchar(20))";

		String sql = """
				create table employee(emp_name varchar(20),
				emp_id int primary key,
				city varchar(20))
				""";
		Connection connection = null;
		Statement statement = null;
		try {
			// get a connection
			connection = DriverManager.getConnection(url, username, password);
			// get a statement object
			statement = connection.createStatement();
			// execute the query - returns false if the table is created
			boolean status = statement.execute(sql);
			System.out.println("table created "+ !status);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
