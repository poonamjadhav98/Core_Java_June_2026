package method;


public class MethodCalling {

	//1. Method with Parameters
	//2. Method without Parameters
	//3. Method with Return type
	//4. Method with Return type (Parameter)
	//5. static method 


	//1. Method with without Parameter (Instance method)

	public void display() {

		System.out.println("In Display Method");
		System.out.println("Core Java");
	}

	//2. Method with Parameters (Instance method)

	public void addTwoNumbers(int a, int b) {

		System.out.println("In addTwoNumbers method");
		System.out.println("Addition = "+(a+b));

	}

	//3. Method with a return type but no parameters 👇 (Instance method)

	int getSubtractionValue() {
		int a=20, b=40;
		return b-a;
	}

	//4. Method with return type, with parameter (Instance method)

	int getMultiplicationValue(int a, int b) {
		int c=a*b;
		return c;
	}

	//5. static method without parameters (static method)

	public static void studentData() {
		String name= "Poonam";
		System.out.println("Student name="+name);

	}

	//6. static method with parameter (static method)

	public static void empData(String empName) {

		System.out.println("Employee name = "+empName);
	}

	//7. static method with return type

	public static String data(String empName) {
		
		return empName;
	}

	public static void main(String[] args) {

		MethodCalling obj = new MethodCalling();

		//1. obj.display();

		//2. obj.addTwoNumbers(10, 50);
		
		//3. System.out.println("Subtraction value = "+obj.getSubtractionValue());
		
		//4. System.out.println("Multiplication Value = "+obj.getMultiplicationValue(50, 5));
		
		//5. studentData(); //a. Direct
		
		//5 MethodCalling.studentData(); //b. using ClassName
		
		//5. obj.studentData(); //c. using object
		
		//6. empData("ABCD");
		
		System.out.println(data("Employee Name = "+data("xyz123")));

		//System.out.println("Employee name = "+data("Poonam123"));
	}
}
