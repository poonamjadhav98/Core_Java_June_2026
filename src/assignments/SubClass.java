package assignments;

import accessmodifiers.AccessModifiers;

public class SubClass extends AccessModifiers {
	
	public static void main(String[] args) {
		
		SubClass obj = new SubClass();
		obj.addTwoNumbers(10, 20);
		System.out.println("Marks: "+obj.marks);
		
		/* The protected access modifier is accessible within the package and 
		 * outside the package, but through inheritance only.
		 * 
		 */
	}
	
	

}
