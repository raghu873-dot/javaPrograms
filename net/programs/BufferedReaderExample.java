package com.net.programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {

		FileReader fr=new FileReader("C:\\fileWriter\\buf.txt");
		BufferedReader br=new BufferedReader(fr);
		String i=br.readLine();
		while(i!= null) {
			System.out.println(i);
			i=br.readLine();
			
		}
		br.close();
	}

}
