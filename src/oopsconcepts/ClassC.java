package oopsconcepts;

public class ClassC extends ClassB {

	//Multilevel inheritance
	
	public void m3() {
		System.out.println("in Class C");

	}

	public static void main(String[] args) {

		ClassC obj = new ClassC();
		obj.m2();	// Class B
		obj.m3();	// Class C
		obj.m1();	// Class A
		System.out.println("number= "+obj.num);
		System.out.println("My name= "+obj.myName);
	}

}
