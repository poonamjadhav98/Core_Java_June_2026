package controlstatements;

public class IfStatement {

	public static void main(String[] args) {

		int a =200, b=300;

		//simple if statement
		if(b>a) {

			System.out.println("Yes...! b is greater than a!");
		}

		//if-else statement

		if(b>a && a<b) {

			System.out.println("b is greater than a!");
		}

		else {

			System.out.println("condition not matched.!");
		}

	}

}
