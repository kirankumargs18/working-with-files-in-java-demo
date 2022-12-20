package com.kirangs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * To perform write operation
 * 
 * we need BufferedWriter and it takes FileWriter as parameter
 * FileWriter takes File as argument 
 * 
 * so we need ---> File, FileReader(file), BufferedReader(fileReader)
 * 
 * example 
 * 
 * File file=new File("filename.txt");
 * FileReader fileReader=new FileWriter(file);
 * BufferedReader bufferedReader=new BufferedReader(fileReader);
 * 
 * bufferedReader.write(data_to_be_written_to_file)
 * */
public class MyFileReader {

	public static void main(String[] args) {
		
		File file = new File("output.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = br.readLine();
			System.out.println(line);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {br.close();} catch (IOException e) {}
		}

	}

}
