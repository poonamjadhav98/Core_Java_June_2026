package assignments;

public class StarPattern1 {

	public static void main(String[] args) {
		
		//Reverse Right-Half (star-pattern) Pyramid
		
		/* *****
		 * ****
		 * ***
		 * **
		 * *
		 */

		for(int i=1; i<=5;i++) {	

			System.out.println("");

			for(int j=5; j>=i;j--) {
				System.out.print("* ");
			}
		}

	}
}
