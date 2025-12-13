package com.db.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedCreateTable {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jfsseptjava";
		String username = "root";
		String password = "root";
		String sql = """
				create table book(title varchar(20),
				book_id int primary key,author varchar(20), price float)
				""";
		try(
			Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement statement = connection.prepareStatement(sql);){
			boolean status = statement.execute();
			System.out.println(status);
		}
			
		}


}
