package exceptionhandling;

import java.io.FileInputStream;

public class Demo {
	
	public static void main(String[] args) {
		
		//1. Compile-time exception
		
		//FileInputStream file = new FileInputStream("C:\\Users\\Data.txt");
		//Unhandled exception type - FileNotFoundException
		
		//file.read();      //IOException
		
		//Class.forName("blocks.Example");     //ClassNotFoundException
		
		
		//2. Runtime Exception (Unchecked Exception)
		System.out.println(1);
		System.out.println(2);
		System.out.println(10/0);
		System.out.println(4);
		
		/**
		 * output:-
		 * 1
		   2
		    Exception in thread "main" java.lang.ArithmeticException: / by zero
			at exceptionhandling.Demo.main(Demo.java:22)
		 */
		
		
	}

}
