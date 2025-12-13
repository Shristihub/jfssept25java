package com.db.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedInsertScan {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsseptjava";
		String username = "root";
		String password = "root";
		String sql1 = """
				create table product(product_name varchar(20),
				product_id int primary key,category varchar(20), price float)
				""";
		String sql = "insert into product(product_name,category,price) values(?,?,?)";
		
		try(
		Connection connection = DriverManager.getConnection(url,username,password);
		PreparedStatement statement = connection.prepareStatement(sql);
		Scanner sc = new Scanner(System.in);){
			
			//set values for placeholders
			statement.setString(1, "Pen");
			statement.setString(2, "Stationary");
			statement.setDouble(3, 100);
			// this is a must. only then the values will be added to db
//			System.out.println("Inserted "+!statement.execute());
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter Product Name");
			String productName = sc.next();
			statement.setString(1,productName);
			System.out.println("Enter Category");
			statement.setString(2, sc.next());
			System.out.println("Enter Price");
			statement.setDouble(3, sc.nextDouble());
			statement.execute();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
