package oopsconcepts;

public class ClassX extends Student{
	
	//Hierarchical Inheritance
	
	public void m1() {
		
		System.out.println("in ClassX method m1");
	}
	
	public static void main(String[] args) {
		
		ClassX obj = new ClassX();
		obj.studentData();
		obj.m1();
		
	}

}
