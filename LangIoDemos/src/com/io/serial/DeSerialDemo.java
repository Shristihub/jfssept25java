package com.io.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("DeSerializing.... ");
		// process of deserialization
		try (FileInputStream fs = new FileInputStream("user.ser");
				ObjectInputStream os = new ObjectInputStream(fs);) {
			
			User user = (User) os.readObject();
			System.out.println(user);
			
		} 
	}
}
