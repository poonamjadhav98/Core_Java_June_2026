package assignments;

public class EvenOddProgram {

	
	public static void main(String[] args) {
		
		int a=51;
		int r=a%2;
		
		System.out.println("Remainder = "+r);
		if(r==0) {
	
			System.out.println("Given Number is Even.");
		}
		
		else {
			
			System.out.println("Given Number is Odd.");
		}
	}
}
