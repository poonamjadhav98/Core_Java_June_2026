package oopsconcepts1;

public class ChildClassVariables extends ParentClassVariables{
	
	int a = 10, b=20;
	
	public void printChildAndParentClassVariables() {
		
		/**
		 * super refers to the parent class object.
		 * "super" keyword used to:
		 * Access parent class variables
		 * Call parent class methods
		 */
		
		System.out.println("a="+super.a);
		System.out.println("b="+super.b);	
		System.out.println("................................");
		super.m1();
	}
	
	public void sum(int a, int b) {
		
		System.out.println("local variables addition: "+(a+b));   //150
		System.out.println("Instance variables with child addition: "+(this.a+this.b)); //30
		System.out.println("Parent variables addition: "+(super.a+super.b)); //400
		super.m1();
		this.m1();
		System.out.println("My Name= "+name);
	}
	
	public void m1() {
		
		System.out.println("in child class m1 method");
	}

	public static void main(String[] args) {
		
		ChildClassVariables obj = new ChildClassVariables();
		//obj.printChildAndParentClassVariables();
		
		obj.sum(100, 50);
		
	}
}
