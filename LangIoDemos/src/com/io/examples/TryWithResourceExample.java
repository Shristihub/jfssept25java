package com.io.examples;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourceExample {
	public static void main(String[] args) throws IOException {

		try (FileReader reader = new FileReader("demo.txt"); 
			 FileWriter writer = new FileWriter("hello.txt",true);) {
			int data = reader.read();
			while (data != -1) {
				// write in file
				writer.write(data);
				data = reader.read();
			}
		} 
	}

}
