package com.kirangs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileReaderWriter {

	public static void main(String[] args) {

		File inputFile = new File("readFile.txt");
		File outputFile = new File("writeFile.txt");

		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;

		try {

			fileReader = new FileReader(inputFile);
			bufferedReader = new BufferedReader(fileReader);

			fileWriter = new FileWriter(outputFile,true);
			bufferedWriter = new BufferedWriter(fileWriter);
			
		    String currentLine="";

			while ((currentLine=bufferedReader.readLine()) != null) {
				bufferedWriter.write(currentLine+"\n");
			}
			System.out.println("Written successfully");

		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {

				if (bufferedReader != null) {
					bufferedReader.close();

				}
				if (bufferedWriter != null) {
					bufferedWriter.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
