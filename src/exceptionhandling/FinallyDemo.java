package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FinallyDemo {

	
	//finally block
	
	/*
	 * - A finally block is executed in all cases, whether an exception occurs / is thrown or not.
   	   - finally block will not be executed after "System.exit(0);" statement
	 */
	public static void main(String[] args) {

		String filePath = "C:\\Users\\Poonam\\Desktop\\abcd.txt";       //correct filePath

		System.out.println("Execution started...!");
		
		try {
			FileReader file = new FileReader(filePath);
			System.out.println("file read");
			System.out.println("file");
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not read");
			
		}finally {
			
			System.out.println(1);
			System.out.println(2);
//			System.exit(0);
			System.out.println(3);
			System.out.println(4);
		}
		System.out.println("Execution end...!");
	}
}