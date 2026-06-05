package variables;


public class LocalVariables {


	//constructor

	public LocalVariables() {
		
		System.out.println("Inside constructor.........");
		int a=20;
		System.out.println(a);

	}

	//instance block/area
	{
		System.out.println("Inside instance block........");
		int x=5;
		boolean flag = true;
		System.out.println(x);
		System.out.println(flag);
	}

	//instance method/area

	public static void test() {
		
		System.out.println("Inside instance method.........");
		String str = "Java";
		System.out.println(str);
		
	}

	public static void main(String[] args) {
//		char a = 'B';
//		System.out.println(a);
		
	
		LocalVariables obj = new LocalVariables();
		
		obj.test();
		
		
		/* Output
		 * 	5     -------- instance block executed 1st (1)
			true  -------- instance block executed 1st (1)
			20    -------- constructor executed  		(2)
			Java  -------- static method executed		(3)

		 * 
		 * 
		 * 
		 */
	}	

}
