package oopsconcepts1;

public class Student extends Data {
	String name = "Poonam";
	int id=10;

	public void studentData() {
		System.out.println("id = "+id);
		System.out.println("Name = "+name);

	}

	public void subject(String subjectName) {

		System.out.println("Subject = "+subjectName);
	}

	public void info() {

		System.out.println("My name: "+myName);	
	}

	public Student(String myName) {     //Parameterized constructor

		super(myName);
	}

	public static void main(String[] args) {
		
		Student obj = new Student("Poonam");
		obj.info();

	}

}

