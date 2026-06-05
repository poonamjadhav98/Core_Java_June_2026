package oopsconcepts1;

public class PrivateMethod {

	
	/**
	 * A private method is a method declared using the private access modifier.

	👉 It can be accessed only within the same class.
	👉 It is not accessible outside the class.
	👉 It is not inherited by subclasses.
	 * 
	 */
	
	private void show() {
		
		System.out.println("In Private method");
	}
	
	void display() {
		System.out.println("In display method");
	}
	
	public static void main(String[] args) {
		
		PrivateMethod obj = new PrivateMethod();
		obj.show();
	}
	
}
