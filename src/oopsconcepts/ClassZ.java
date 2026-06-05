package oopsconcepts;

public class ClassZ extends Student {

	//Hierarchical Inheritance

	public void m3() {

		System.out.println("in ClassZ method m3");
	}
	
	public static void main(String[] args) {
		
		ClassZ obj = new ClassZ();
		
		obj.studentData();
		obj.m3();
	}

}
