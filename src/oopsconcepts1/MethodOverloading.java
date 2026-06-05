package oopsconcepts1;

public class MethodOverloading {

	public void add() {

		System.out.println("In addition method");
	}

	public void add(int a) {

		System.out.println("Sum= "+(10+a));
	}

	public void add(String str) {

		System.out.println("Sum= "+str);
	}

	public void add(int a, long b) {

		System.out.println("Sum= "+(a+b));
	}

	
	/**
	 * Method Overloading - 
	 * 
	 * 	i) in same class
		ii) method name should be same
		iii) same no. of parameters but different data types
		iv) sequence of parameters does also matter
		See below method: Duplicate method
	 */
	

//	public void add(int a, long c) {		
//
//		System.out.println("Sum= "+(a+b));
//	}


	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.add();
		obj.add(10, 30);
		obj.add(100);
		obj.add("Poonam");
		obj.add(90, 1);

	}

}
