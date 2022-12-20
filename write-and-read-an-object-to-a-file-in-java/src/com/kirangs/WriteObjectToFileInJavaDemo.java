package com.kirangs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *  how to write a Java Object to a file in the local file system
 *  
 * To do this serialization, the class of the object must implement the
 * Serializable interface. This will enable us to perform basic I/O operations
 * on the class in Java.
 * 
 * To write an object to a file, all you need to do is the following:
 * 
 * 1. Create a Java class that implements the Serializable interface.
 * 2. Open a new oran existing file using FileOutputStream. 
 * 3. Create an instance of ObjectOutputStream and pass FileOutputStream as an argument to its constructor.
 * 4. Use ObjectOutputStream.writeObject() method to write the object to the file.
 * 
 * 
 * Serialization in Java allows us to convert an Object to stream that we can send over the network or
 * save it as file or store in DB for later usage. 
 * Deserialization is the process of converting Object stream to actual Java Object to be used in our program.
 */
public class WriteObjectToFileInJavaDemo {

	public static void main(String[] args) {
		
		Employee employee=new Employee("1", "Kiran", 23);
		
		try {
			
			FileOutputStream fos=new FileOutputStream("object.rar");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(employee);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
