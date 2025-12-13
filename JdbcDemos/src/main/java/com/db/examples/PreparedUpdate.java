package com.db.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedUpdate {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsseptjava";
		String username = "root";
		String password = "root";
		String sql = "update product set price = ? where product_id=?";
		
		try(
		Connection connection = DriverManager.getConnection(url,username,password);
		PreparedStatement statement = connection.prepareStatement(sql);){
			
			//set values for placeholders
			statement.setDouble(1, 6000);
			statement.setInt(2, 3);
			System.out.println("updated count "+statement.executeUpdate());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
