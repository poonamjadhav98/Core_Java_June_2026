package controlstatements;

public class IfElseLadder {
	
	public static void main(String[] args) {
		
		int age=20;
		
		if(age>20) {
			//logic 1
			System.out.println("age is greater than 20.");
		}else if(age<10) {
			//logic 2
			System.out.println("age is less than 10.");
		}else { 	//print
			//logic 3
			System.out.println("age is in between 10 to 20.");
		}
	}

}
