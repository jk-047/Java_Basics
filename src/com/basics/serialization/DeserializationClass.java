package com.basics.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//deserialization implementation
public class DeserializationClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fos = new FileInputStream("/Users/chamr/OneDrive/Desktop/Emp.ser"); // location of the serialized file
		ObjectInputStream ois = new ObjectInputStream(fos);
		
//		type casting the output stream to the class
		SerialisationEmployeeClass ep = (SerialisationEmployeeClass) ois.readObject();  
		
		
		System.out.println(ep.Id);
		System.out.println(ep.name);
		System.out.println(ep.salary);
		System.out.println(ep.ssn); // since the ssn field is marked transient, it is not loaded into the .ser file and returns zero.
		
	}

}
