package com.basics.fileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream(new File("/Users/chamr/OneDrive/Desktop/git Tokens.txt"));
			System.out.println("file found and opened");
			
			FileOutputStream fos = new FileOutputStream("/Users/chamr/OneDrive/Desktop/newFile.txt");
//			FileOutputStream fos= new FileOutputStream(new File("/Users/chamr/OneDrive/Desktop/newFile1.txt"));
			System.out.println("file pointer for newfile created.");
			
			int i;
			System.out.println("Reading the file: ");
			while((i=fis.read())!=-1)
			{
				fos.write(i);
			}
			
			System.out.println("\nfile reading and newFile writing completed.");
			
			fis.close();//closing the file handler
			fos.close();// closing file pointer
			
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
