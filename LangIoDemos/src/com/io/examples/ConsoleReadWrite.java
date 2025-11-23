package com.io.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReadWrite {

	public static void main(String[] args) {
		//  InputStreamReader is a bridge from byte streams to character streams: 
		// It reads bytes and decodes them into characters 
		InputStreamReader ins = new InputStreamReader(System.in);
		
		//create an object of bufferedreader which can read only characters
//		pass an object of subclass of Reader - InputStreamReader
		BufferedReader br = new BufferedReader(ins);
		System.out.println("Read data");
		try {
			char val = (char)br.read();
			while(val!='q'){
				System.out.print(val);
				val = (char)br.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
