
package exceptionhandling;


public class HandleRunTimeException {
	
	public static void main(String[] args) {
		
		int number=100;
		int d=0;
		System.out.println("Execution started");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		try {
			int output=number/d;
			System.out.println("output = "+output);
			System.out.println("logic completed");
			
		} catch (Exception e) {
			System.out.println("logic not completed");
			e.printStackTrace();
			
		}
		
		System.out.println(4);
		System.out.println(5);
		System.out.println("Execution end");
		
		System.out.println("****************************");
		
		String str = "Ja";
		System.out.println("String logic started...!");
		
		try {
			
			System.out.println("Value of index 3 is = "+str.charAt(3));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Logic not completed...!");
			e.printStackTrace();
		}
		

		System.out.println("End String logic");
	}

}
