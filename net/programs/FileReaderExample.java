package com.net.programs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {

		try {
			FileReader fr=new FileReader("C:\\fileWriter\\abc.txt");
			int i=fr.read();
			while(i!= -1) {
				System.out.println((char)i);
				i=fr.read();
				
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
