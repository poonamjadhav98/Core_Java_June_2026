package oopsconcepts;

import method.MethodCalling;

public class Test2 extends MethodCalling{
	/*
	 * 1.Inheritance means acquiring the properties of parent class into child class
	 * 2.The process of acquiring the properties and behavior of one class to
	 * another class is called Inheritance.
	 */

	public void m4() {

		System.out.println("In m4() method");
		
	}
	
	public static void main(String[] args) {
		
		Test2 obj = new Test2();
		obj.m4();
	}

}
