package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandleCompilerTimeException {

	public static void main(String[] args){

		String filePath = "C:\\Users\\Poonam\\Desktop\\abcd.txt";       //correct filePath
//		String filePath = "C:\\Users\\Poonam\\Desktop\\cd.txt";         //incorrect filePath

		File file = new File(filePath);
		//System.out.println(file.getAbsolutePath());
		
		System.out.println("Execution started");		

		try {

			FileReader f = new FileReader(file);
			System.out.println("File Read");
		}
		catch (FileNotFoundException e) {

			e.printStackTrace();
//			String aString=e.getMessage();
//			System.out.println(aString); //C:\Users\Poonam\Desktop\cd.txt (The system cannot find the file specified)

			System.out.println("File not read");
			
		} finally {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}
			
		System.out.println("Execution end");
	}
}
