package oopsconcepts;

public class Car extends Vehicle {
	
	void drive() {
		
		System.out.println("Car is driving");
	}
	
	public static void main(String[] args) {
	
		Car c = new Car();
		c.start();	//inherited method
		c.drive();	//child class method
		
		/*
		 * 🔍 What’s Happening Here?
		 * 
		 * Car inherits the start() method from Vehicle 
		 * Car can use: Its own methods
		 * Parent class methods 
		 * Only one parent class → this is single inheritance
		 */
		
	}

}
