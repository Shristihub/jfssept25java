package com.db.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsseptjava";
		String username = "root";
		String password = "root";
		String insertQuery = "insert into employee values('Raju',1,'Pune')";
		
		try(
		 Connection connection = DriverManager.getConnection(url, username, password);	
		 Statement statement = connection.createStatement();){
			
		 int updatedCount =	statement.executeUpdate(insertQuery);
		 System.out.println(updatedCount);	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
