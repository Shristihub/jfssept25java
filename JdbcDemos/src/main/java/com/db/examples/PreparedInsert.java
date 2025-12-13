package com.db.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedInsert {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsseptjava";
		String username = "root";
		String password = "root";
		String sql = "insert into book values(?,?,?,?)";
		
		try(
		Connection connection = DriverManager.getConnection(url,username,password);
		PreparedStatement statement = connection.prepareStatement(sql);){
			
			//set values for placeholders
			String title = "Spring in Action";
			double price = 1234.0;
			statement.setString(1, title);
			statement.setInt(2, 101);
			statement.setString(3, "Steve");
			statement.setDouble(4, price);
			// this is a must. only then the values will be added to db
			System.out.println("Inserted "+!statement.execute());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
