package exceptionhandling;

public class ThrowsKeywordDemo {

	public static void main(String[] args) throws ClassNotFoundException {

		/*
		 * ► throws keyword- is used to declare exceptions. 
			- exception handles at compile time.
			-it specifies that there may occur an exception in the method
			-it doesn't throw an exception
			-it is always used with method signature.

		 */
		//create an object to call test()
		ThrowsKeywordDemo obj = new ThrowsKeywordDemo();
		obj.test();

	}

	public void test() throws ClassNotFoundException {

		Class.forName("");
	}

}
