package oopsconcepts1;

public class Test extends PrivateMethod{
	
	void display() {
		
		System.out.println("In Test display() method");
		
		//show();       //Change visibility of show() to protected
						//Child class cannot access parent’s private method.
	}
	
	public static void main(String[] args) {
		
		PrivateMethod obj1 = new Test();
		
		obj1.display();           //output - In Test display() method
		
		
						/**
						compile time error - Change visibility of show() to protected
						Because show() is private
						*/
	}

}
