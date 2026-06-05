package assignments;



import accessmodifiers.AccessModifiers;

public class AccessModifiersExample {
	
	public static void main(String[] args) {
		
		AccessModifiers obj=new AccessModifiers();
		obj.display();
		System.out.println("Age = "+obj.age);
		
		//Try to access private variables & methods
		/**
		it cannot be accessed from outside the class. 
		*/
		
		
		//Try to access default variables & methods
		
		//It cannot be accessed from outside the package.
	}

}
