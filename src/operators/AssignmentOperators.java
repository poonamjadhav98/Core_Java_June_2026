package operators;

public class AssignmentOperators {
	
	public static void main(String[] args) {
		
		//with =
		
		int a=10, b=30, sum, sum1, sub;
		int multi=10;
		int div=30;
		
		sum=a+b;
		System.out.println("Sum="+sum);
		sum1=b;
		System.out.println("value of b="+sum1);
		
		//with +=
		a+=90;
		b+=70;
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
		
		//with -=
		a-=8;
		sub=a-b;
		System.out.println("value of a="+a);
		System.out.println("value of sub="+sub);
		
		//with *=
		multi*=10;
		System.out.println("Multiplication="+multi);
		
		//with /=
		div/=10;
		System.out.println("Division="+div);
		
	}

}
