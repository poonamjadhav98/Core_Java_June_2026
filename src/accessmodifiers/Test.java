package accessmodifiers;

public class Test {
	
	public static void main(String[] args) {
		
		AccessModifiers obj=new AccessModifiers();
		
		//Try to access public variables & methods
		obj.display();
		System.out.println("Age= "+obj.age);
		
		
		
		//Try to access private variables & methods
		/**
		*it cannot be accessed from outside the class. 
		*/
		
		
		//Try to access protected variables & methods
		
		obj.addTwoNumbers(10, 20);
		System.out.println("Marks: "+obj.marks);
		
		//Try to access default variables & methods
		obj.sum();
		System.out.println("flag: "+obj.flag);
		
	}
	
}
