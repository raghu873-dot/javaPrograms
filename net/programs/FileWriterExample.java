package com.net.programs;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {

		try {
			FileWriter fw=new FileWriter("C:\\fileWriter\\abc.txt");
			fw.write("100");
			fw.write("raghu");
			fw.write('w');
			fw.flush();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		System.out.println("success");
	}

}
