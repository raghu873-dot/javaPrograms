package com.net.programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationAndDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee emp=new Employee();
		
		//serialization
		FileOutputStream fos=new FileOutputStream("C:\\fileWriter\\ser.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		
		//Deserialization
		FileInputStream fis=new FileInputStream("C:\\fileWriter\\ser.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp1=(Employee) ois.readObject();
		
		System.out.println(emp1.i+" "+emp1.j);
	}

}

class Employee implements Serializable{
	int i=10;
	int j=20;
}
