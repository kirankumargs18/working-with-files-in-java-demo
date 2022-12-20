package com.kirangs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * File file = new File("readFile.txt");
 * FileReader fr = new FileReader(file);
 * BufferedReader br = new BufferedReader(fr);
 * br.readLine(); //returns string
 * 
 * 
 * reading of characters, arrays, and lines
 * */
public class UsingBufferedReaderDemo {

	public static void main(String[] args) {

		/**
		File file = new File("readFile.txt");
		try {

			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String currentLine = "";

			while ((currentLine = br.readLine()) != null) {
				System.out.println(currentLine);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		*/
		
		try {
			BufferedReader br=new BufferedReader(new FileReader(new File("readFile.txt")));
			String currentLine = "";
			
			while((currentLine=br.readLine())!=null) {
				
				System.out.println(currentLine);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
