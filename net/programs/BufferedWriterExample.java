package com.net.programs;

import java.io.FileWriter;
import java.io.*;

public class BufferedWriterExample {

	public static void main(String[] args) throws IOException {

		FileWriter writer = new FileWriter("C:\\fileWriter\\buf.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);   
	    buffer.write(100);
	    buffer.newLine();
	    buffer.write("raina");
	    buffer.close();
		
	}

}
