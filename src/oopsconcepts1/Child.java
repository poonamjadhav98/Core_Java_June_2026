package oopsconcepts1;

public class Child extends Parent{
	
	static void staticMethod() {    //Method hiding
		
		System.out.println("Child static method");
	}
	
	//privateMethod()         ❌ Not inherited
	
	//finalMethod()           ❌ Cannot override 
		
	
	

}
