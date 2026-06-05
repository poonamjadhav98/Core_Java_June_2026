package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		
		int a=40, b=30;
		boolean flag=true;
		
		//Logical Operator AND - &&
		
		System.out.println("Logical Operator using AND (&&)");
		System.out.println(a>b && b<a);
		
		/****Logical AND (&&) Table
		 * 
		-true    true >>>> true
		-false   true >>>> false
		-true    false >>>> false
		-false   false >>>> false*/
		
		//Logical Operator OR (||)
		
		System.out.println("Logical Operator using OR (||)");
		System.out.println(a>b || b>a);
		
		/****Logical OR (||) Table
		 * 
		-true    true >>>>> true
		-true    false >>>> true
		-false   true >>>>> true
		-false   false >>>> false*/

		
		//Logical Operator Using NOT (!)
		
		System.out.println("Logical Operator using NOT (!)");
		System.out.println(!flag);
		
		
	}

}
