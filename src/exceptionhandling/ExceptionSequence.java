package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionSequence {
	
	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\Poonam\\Desktop\\abcd.txt";       //correct filePath
		
		System.out.println("Execution started...!");
		try {
			FileReader file = new FileReader(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
