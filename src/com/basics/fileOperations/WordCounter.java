package com.basics.fileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class WordCounter {

	public static void main(String[] args) {

		try 
		{
			FileReader reader = new FileReader(new File("/Users/chamr/OneDrive/Desktop/git tokens.txt"));
			System.out.println("opened new file"); 
			BufferedReader br = new BufferedReader(reader);
			
			String line;
			int count = 0;
			System.out.println("reading file");
			
			while((line=br.readLine())!= null) // iterating through each line
			{
				StringTokenizer st = new StringTokenizer(line);
				System.out.println(line);
				
				while (st.hasMoreTokens()) 
				{
					count++;
					st.nextToken(); // iterate to next token
				}
			}
			
			System.out.println("Total no of words in the file = " + count);
			
			System.out.println("file connections closed");
			reader.close();
			br.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
