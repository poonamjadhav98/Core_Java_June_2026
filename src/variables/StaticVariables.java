package variables;

public class StaticVariables {
	
	
	static int myAge=30; 		//static variables are declared using 'static' keyword
	static String name = "Mike";
	
	//1. direct access static variable
	
	//instance method
	public void getName() {
		System.out.println("Inside Instance method........");
		System.out.println(myAge);     //we can access static variables directly inside instance method.
		System.out.println(name);		//direct access instance variables
		
		
	//2. Using class name
		
		System.out.println("Using Class name inside instance method.......");
		System.out.println(StaticVariables.myAge);
		System.out.println(StaticVariables.name);
		
	//3. Using Object
		
		StaticVariables obj= new StaticVariables();
		System.out.println("Using Object inside instance method........");
		System.out.println(obj.myAge);
		System.out.println(obj.name);
	}
	

	public static void main(String[] args) {
		
		StaticVariables obj= new StaticVariables();
		
		//1. direct access static variables
		
		System.out.println("direct access static instance variables.......");
		System.out.println(myAge);
		System.out.println(name);
		
		
		//2. Using class name
		
		System.out.println("Using class name inside static method.......");
		System.out.println(StaticVariables.myAge);
		System.out.println(StaticVariables.name);
				
		
		//3. Using Object inside static method
		
		System.out.println("Using Object inside static method.........");
		System.out.println(obj.myAge);
		System.out.println(obj.name);
		
		System.out.println("************** Instance method calling *****************");
		
		obj.getName();
	}

}
