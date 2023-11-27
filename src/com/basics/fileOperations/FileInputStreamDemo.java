package com.basics.fileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream(new File("/Users/chamr/OneDrive/Desktop/git Tokens.txt"));
			System.out.println("file found and opened");
			
			System.out.println("Reading the file: ");
			
			int i;
			
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			System.out.println("\nfile read.");
			
			fis.close();//closing the file handler
			System.out.println("file closed");
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found!");
			System.out.println(e);
		} 
		catch (IOException e) 
		{
			System.out.println("Error reading the file!");
			System.out.println(e);
		}
		
	}

}
