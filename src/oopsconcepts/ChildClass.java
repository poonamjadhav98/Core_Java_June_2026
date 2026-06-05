package oopsconcepts;

public class ChildClass extends ParentClass{
	
	boolean flag=false;
	
	public void message() {
		
		System.out.println("In child class Method");
	}
	
	public static void main(String[] args) {
		
		/**
		 * With Child class object
		 */

		ChildClass child = new ChildClass();
		
		child.message();					//calling child class method
		System.out.println(child.flag);		//calling child variable
		child.dialog();						//calling PARENT class method
		System.out.println(child.myName);	//calling parent class variable
		
		System.out.println(".....................................");
		
		/**
		 * With Parent class object
		 */
		
		System.out.println(".....................................");

		ParentClass parent = new ParentClass();
		parent.dialog();
		System.out.println("My name in Parent class = "+parent.myName);
		
		System.out.println(".................Object Reference is of Parent class......................");
		System.out.println("************************************************************");
		
		/**
		 * 
		 * With Child object but Object Reference is of Parent class
		 */
		
		/**
		 * Compile time error - compiler will check if same (e.g. m1 and m2) methods are present in Parent & child class
		 * If yes, at runtime it will call Child class (m1 and m2) methods because we have created Child class object
		 */
		

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		//Parent parent = new Child();
		ParentClass obj = new ChildClass();
		obj.dialog();		//calling method but compiler will check if same methods are present in parent class.
		
		obj.message();		//calling method but compiler will check if same methods are present in child class.
		System.out.println(obj.myName);
		
		/**
		 * With Parent object but Object Reference is of Child class
		 */
				
		//Child child = new Parent();
		//ChildClass childClass = new ParentClass(); //Compile time error
		
		
	}

}
