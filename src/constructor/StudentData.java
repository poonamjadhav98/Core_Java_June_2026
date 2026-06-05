package constructor;

public class StudentData {
	
	int studentID;
	String studentName;
	int a;
	int b;
	
	public void studentInfo() {
		System.out.println("ID = "+studentID);
		System.out.println("Name = "+studentName);
	}
	
	public StudentData() {	//No-arg constructor
		studentID=10;
		studentName="Poonam";
		a=10;
		b=20;
	}
	
	public StudentData(int a, int b) {		//Parameterized constructor
		
		this.a=a;
		this.b=b;
	}
	
	
	public static void main(String[] args) {
		StudentData obj= new StudentData();
		obj.studentInfo();
		System.out.println("Sum = "+(obj.a+obj.b));
		
		StudentData obj1 = new StudentData(20, 30);
		System.out.println("Sum1 = "+(obj1.a+obj1.b));
		
		
	}

}
