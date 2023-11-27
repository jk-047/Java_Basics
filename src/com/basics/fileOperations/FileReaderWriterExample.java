package com.basics.fileOperations;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterExample {

	public static void main(String[] args) throws Exception {
		
		// open file
		FileReader reader = new FileReader("/Users/chamr/OneDrive/Desktop/newFile.txt"); 
		FileWriter writer = new FileWriter("/Users/chamr/OneDrive/Desktop/newFile1.txt");
		
		int i;
		//copying the contents to another file
		while((i=reader.read())!=-1)
		{
			writer.write(i);
		}
		
		//close file connections
		reader.close();
		writer.close();
		
	}

}
