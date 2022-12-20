package com.kirangs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A simple text scanner that can parse primitive types and strings using
 * regular expressions. A Scanner breaks its input into tokens using a delimiter
 * pattern, which by default matches whitespace. The resulting tokens may then
 * be converted into values of different types using the various next methods
 * 
 * 
 * File file=new File("readFile.txt");
 * Scanner sc=new Scanner(file);
 * sc.nextLine(); //returns string
 */
public class UsingScannerClassDemo {

	public static void main(String[] args) {
		
		File file=new File("readFile.txt");
		
		try {
			
			Scanner sc=new Scanner(file);
			
	
			while (sc.hasNextLine()) {

				System.out.println(sc.nextLine());
			}
			 
			
			/**
			//without using loops
			sc.useDelimiter("\\Z");
			System.out.println(sc.next());
			*/
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
