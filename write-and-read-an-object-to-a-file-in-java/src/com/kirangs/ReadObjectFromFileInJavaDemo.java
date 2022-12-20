package com.kirangs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * how to read a Java Object from a file or how to deserialize the serialized
 * object saved in a file.
 * 
 * The deserialization process is quite similar to the serialization process.
 * Basically, to read an object from a file,
 * 
 * you need to follow the below steps:
 * 
 * Open the file that has the Java Object stored using FileInputStream. 
 * Create an instance of ObjectInputStream and pass FileInputStream as an argument to its constructor. Use ObjectInputStream.readObject() method to read the object
 * from the file. The above method will return a generic object of type Object.
 * You need to cast this object to its original type to properly use it.
 */
public class ReadObjectFromFileInJavaDemo {

	public static void main(String[] args) {

		
		try {
			FileInputStream fis = new FileInputStream("object.rar");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			/**
			Object object = ois.readObject();
			System.out.println(object);  //Employee [id=1, name=Kiran, age=23]
			*/
			
			Employee employee=(Employee) ois.readObject();
			System.out.println(employee); //Employee [id=1, name=Kiran, age=23]
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
