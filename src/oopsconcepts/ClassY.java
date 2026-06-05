package oopsconcepts;

public class ClassY extends Student {
	//Hierarchical Inheritance

	public void m2() {

		System.out.println("in ClassY method m2");
	}
	
	public static void main(String[] args) {
		
		ClassY obj = new ClassY();
		obj.studentData();
		System.out.println("id "+obj.id);
		System.out.println("name ="+obj.myName);
		obj.m2();
	}
	
	

}
