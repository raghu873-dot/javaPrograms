package com.net.programs;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter pw=new PrintWriter("C:\\fileWriter\\print.txt");
		pw.write(100);
		pw.println(true);
		pw.flush();
	}

}
