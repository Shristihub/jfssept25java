package com.io.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialDemo {

	public static void main(String[] args) {
		User user = new User();
		user.setUsername("Jo");
		user.setUserId(1);
		user.setCity("Bengaluru");
		System.out.println("Serializing "+user.getUsername());
		// process of serialization
		try (FileOutputStream fs = new FileOutputStream("user.ser");
				ObjectOutputStream os = new ObjectOutputStream(fs);) {
			os.writeObject(user);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
