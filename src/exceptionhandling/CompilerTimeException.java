package exceptionhandling;

public class CompilerTimeException {

	public static void main(String[] args) throws ClassNotFoundException {

		//1. Compiler Time Exception

		//i.Handle exception using try-catch block

		/*System.out.println("Code started");

		try {
			Class.forName("blocks.Example");
			//Class.forName("blocks.ABCD");           //class not found
			System.out.println("Class found");
			System.out.println(123);
			System.out.println(1234);

		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
			e.printStackTrace();
		}

		System.out.println(123456);
		System.out.println("Code done");
*/
	  //ii. using throws keyword

			System.out.println("Code started");  //output --> code started
			
			Class.forName("blocks.Example");
			System.out.println("abcd");
			
			
			System.out.println(123456);
			System.out.println("Code done");
			
		}
	
}












