package controlstatements;

public class SwitchStatement {

	public static void main(String[] args) {


		int ch=1;

		switch (ch) {
		case 1:
			System.out.println("Launch application in Chrome.");
			break;

		case 2:
			System.out.println("Launch application in Edge.");
			break;
			
		case 3: 
			System.out.println("Launch application in Opera.");
			break;
			
		default:
			System.out.println("Kindly select values: 1, 2 or 3.");
			
		}

	}
}
