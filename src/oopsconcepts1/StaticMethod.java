package oopsconcepts1;

public class StaticMethod {


	static void show() {

		System.out.println("In static method");
	}

	public static void main(String[] args) {

		//		StaticMethod obj = new StaticMethod();
		//		obj.show(); 				//Not recommended
		
		
		
		

		//StaticMethod.show();        Calling static method using class name
		show();							//Recommended way
	}
}
