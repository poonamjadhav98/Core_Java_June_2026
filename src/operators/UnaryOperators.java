package operators;

public class UnaryOperators {
	
	public static void main(String[] args) {
		
		int a=10, preIncrement=50;
		int b=20, postIncrement=100;
		
		//Pre-increment (++Before_Variable)
		System.out.println("Value a="+a);//10
		System.out.println("After pre-increment value of a = "+(++a));//11
		System.out.println("Value a = "+a);//11
		
		//Post-increment (After_Variable++)
		System.out.println("Value b = "+b);//20
		System.out.println("After post-increment value of b = "+(b++));//20
		System.out.println("Value of b = "+b);//21
		
		++preIncrement;
		postIncrement++;
		
		System.out.println("Value a = "+preIncrement);
		System.out.println("Value b = "+postIncrement);
		
		/////////////////// Decrement ////////////////////
		
		
		int preDecrement=500;
		int postDecrement=600;
		
		//Pre-decrement (--Before_Variable)
		
		System.out.println("value preDecrement="+preDecrement); //500
		System.out.println("After preDecrement value of preDecrement = "+(--preDecrement)); //499
		System.out.println("Value preDecrement = "+preDecrement); //499
		
		//Post-decrement (After_Variable--)
		
		System.out.println("Value of postDecrement = "+postDecrement); //600
		System.out.println("After postDecrement Value of postDecrement = "+(postDecrement--)); //600
		System.out.println(postDecrement--); //599
		
		
		
	}

}
