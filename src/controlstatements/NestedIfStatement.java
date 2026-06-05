package controlstatements;

public class NestedIfStatement {

	public static void main(String[] args) {

		//4. Nested-if statement
		
		int age=20;

		if(age>=20) {

			//logic 1

			System.out.println("Age is greater than or equal to 20");

			if(age>20) {

				//logic 2

				System.out.println("Age is greater than 20.");
			}
			else {

				//logic 3

				System.out.println("Age is equal to 20.");
			}
		}
			else {

			//logic 4

			System.out.println("Age is less than 20.");

			if(age>10 && age<20) {

				//logic 5

				System.out.println("Age is in between 10 to 20.");
			}
			else {

				//logic 6

				System.out.println("Age is less than 10.");

			}
		}
	}
}
