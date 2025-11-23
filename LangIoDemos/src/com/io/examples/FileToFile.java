package com.io.examples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileToFile {
	public static void main(String[] args) {
			
		FileReader reader = null; 
		FileWriter writer = null;
		try {
			//Read from file
			reader = new FileReader("demo.txt");
			//write into another file
			// if file cannot be created or opened throws exception
			writer =  new FileWriter("hello.txt");
			int data = reader.read();
			while(data!=-1) {
				//write in file
				writer.write(data);
				data = reader.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			  if(reader!=null)
				reader.close();
			  if(writer!=null)
				  writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
	
	

}
