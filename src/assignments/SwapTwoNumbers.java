package assignments;

public class SwapTwoNumbers {


	public static void main(String[] args) {

		int a=10, b=20;

		System.out.println("Before swapping value of a = "+a);
		System.out.println("Before swapping value of b = "+b);

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("-----------------------------------");

		System.out.println("After swapping value of b = "+b);

		System.out.println("After swapping value of a = "+a);


	}
}
