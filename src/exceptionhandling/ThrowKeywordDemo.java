package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowKeywordDemo {
	
	public static void main(String[] args) {
		
		//Using throw keyword
		/*
		 * throw keyword - is used to throw an exception
		 */
		
		String filePath = "C:\\Users\\Poonam\\Desktop\\cd.txt";           //incorrect path
		File file = new File(filePath);		
		System.out.println("Execution started");	

		try {

			FileReader f = new FileReader(file);
			System.out.println("File Read");
		}
		catch (FileNotFoundException e) {
			
			throw new Error("File not read successfully: "+filePath);
	}
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println("Execution end");
		
		/*
		 * Output- 
		 * Execution started
			Exception in thread "main" java.lang.Error: File not read successfully: C:\Users\Poonam\Desktop\cd.txt
			at exceptionhandling.ThrowKeywordDemo.main(ThrowKeywordDemo.java:24)

		 */
	}
}
