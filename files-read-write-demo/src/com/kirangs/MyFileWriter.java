package com.kirangs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * To perform write operation
 * 
 * we need BufferedWriter and it takes FileWriter as parameter
 * FileWriter takes File as argument 
 * 
 * so we need ---> File, FileWriter(file), BufferedWriter(fileWriter)
 * 
 * example 
 * 
 * File file=new File("filename.txt");
 * FileWriter fileWriter=new FileWriter(file);
 * BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
 * 
 * bufferedWriter.write(data_to_be_written_to_file)
 * */
public class MyFileWriter {

	public static void main(String[] args) {
		// read from keyboard and write to file
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String line = scan.nextLine();
		File file = new File("output.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(line);
			System.out.println("Written to file");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {if(bw!=null)bw.close();} catch (IOException e) {}
		}
	}

}
