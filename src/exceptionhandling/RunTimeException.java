package exceptionhandling;

public class RunTimeException {

	public static void main(String[] args) {
		
		//2. Run time exception
		
			System.out.println("code started");

		try {
			
			Class.forName("blocks.ABCD");
			System.out.println("Class found");
			System.out.println(123);
			System.out.println(1234);

		} catch (ClassNotFoundException e) {
			
			System.out.println("class not found");
			//e.printStackTrace();
		}
		
			System.out.println(123456);
			System.out.println("code done");
	}

}
