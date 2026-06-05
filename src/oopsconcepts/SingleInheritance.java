package oopsconcepts;

public class SingleInheritance extends Student{
	
	
	
	public void printStudentData() {
		
		studentData();
	}
	
	public static void main(String[] args) {
		
		SingleInheritance obj = new SingleInheritance();
		
		obj.studentData();
		System.out.println("id = "+obj.id);
		System.out.println("Name = "+obj.myName);
		
	}

}
