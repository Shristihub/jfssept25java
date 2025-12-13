package com.db.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedRetrieve1 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsseptjava";
		String username = "root";
		String password = "root";
		String sql = "select * from product where category=?";

		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement statement = connection.prepareStatement(sql);) {
			// set the values for the question marks
			statement.setString(1, "Electronics");
			
			try (ResultSet rs = statement.executeQuery();) {
				while (rs.next()) {
					String productName = rs.getString("product_name");
					int productId = rs.getInt(2); // column Number
					double price = rs.getDouble("price"); // column name
					String category = rs.getString("category");
					System.out.println(productName + " " + productId + " " + category + " " + price);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
