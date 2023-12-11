package com.basics.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

//serialization implementation

public class SerializationClass {

	public static void main(String[] args) {


		try {
//			get the file location
			FileOutputStream fos = new FileOutputStream("/Users/chamr/OneDrive/Desktop/Emp.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos); // passing location to output stream
			
			SerialisationEmployeeClass emp = new SerialisationEmployeeClass(1, "Amrutha", 100000, 12312);
			
			oos.writeObject(emp); // writing the output stream
			System.out.println("Employee object written successfully!");
			
			fos.close();
			oos.close();
			
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("cannot serialize");
			e.printStackTrace();
		}
		
	}

}
