package method;

public class MethodChaining {


	//Instance Method
	public void m1() {

		//instance area
		System.out.println("In m1 method.");
		test1();	//calling static method directly in instance area
	}

	//Instance Method
	public void m2() {
		//instance area
		System.out.println("In m2 method.");		
		m1();		//calling instance method directly in instance area
		MethodChaining.test2();	 //calling static method using className in instance area
	}

	//Instance Method
	public void m3() {
		//instance area
		System.out.println("In m3 method.");	
		m2();
		
		MethodChaining objChaining= new MethodChaining();
		objChaining.test4();		//calling static method using object in instance area
	}

	//static method
	public static void test1() {

		//static area
		System.out.println("In test1 method");
	}

	//static method
	public static void test2() {

		//static area
		System.out.println("In test2 method");
		test1(); //calling static method directly in static area
	}

	//static method
	public static void test3() {

		//static area
		System.out.println("In test3 method");

		MethodChaining.test2();	//calling static method test2() using className in static area
	}

	//static method
	public static void test4() {

		//static area
		System.out.println("In test4 method");
		MethodChaining obj= new MethodChaining();
		obj.test3();	     //calling static method test3() using object in static area

	}

	public static void main(String[] args) {

		MethodChaining obj= new MethodChaining();
		//obj.m3(); //Instance method calling

//		test2();	//static method calling directly
//		test3();
//		test4();
		//obj.m1();
		obj.m3();
	}







}
