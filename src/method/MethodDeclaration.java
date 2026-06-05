package method;

import variables.InstanceVariables;

public class MethodDeclaration {


	//1. Method with without parameter

	public void display() {

		System.out.println("In Display Method");	

	}

	//2. Method with Parameter 

	public void sum(int a, int b)
	{

		System.out.println("In sum method sum = "+(a+b));	
	}

	//3. Method with return type without parameter

	public int subtraction() {

		int a=20, b=30;
		return b-a;
	}


	//4. Method with return type with Parameter

	int multiplication(int a)
	{
		System.out.println("In Multiplication method");
		return a*2;

	}

	//5. Static method without parameter
	static void test() {

		System.out.println("In static method.");
	}

	//6. Static method with parameter

	static void m1(boolean flag) {

		System.out.println("In static method with Parameter");
		System.out.println(flag);
	}

	//7. static method with return type

	static char m2(boolean flag) {
		System.out.println("In static method with Parameter");
		return 'a';
	}
	
	//8. method declaration using className
	
	public void empData(InstanceVariables instaClass) {
		
		instaClass.test();
	}

}
