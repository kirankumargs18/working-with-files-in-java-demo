package com.kirangs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader fr=new FileReader("filename.txt");
 * fr.read(); // returns int
 * 
 * Convenience class for reading character files
 * */
public class UsingFileReaderDemo {
	
	public static void main(String[] args) {
		
		try {
			
			FileReader fr=new FileReader("readCharFile.txt");
			
			int i=-1;
			
			while((i=fr.read())!=-1) {
				
				System.out.println(i+" "+(char)i); //prints ascii values and chars
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
