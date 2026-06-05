package exceptionhandling;

public class ArithmeticException {

	public static void main(String[] args) {

		//2. Run time exception example

		System.out.println("code started");

		int age=10;
		try {
			System.out.println(10/0);
			System.out.println("logic completed");

		} catch (Exception e) {
			System.out.println("logic not completed");
			e.printStackTrace();
		}

		System.out.println("code done");
	}

}
