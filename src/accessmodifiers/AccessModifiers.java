package accessmodifiers;

public class AccessModifiers {

	//1. public access modifier with variable
	public int age=20;

	//3. private access modifier with variable

	private String name = "Poonam";

	//5. protected access modifier with variable

	protected float marks = 10.20f;

	//7. default access modifier with variable

	boolean flag = false;

	//2. public access modifier with method

	public void display() {
		System.out.println("In public method");
		System.out.println("Hello World..!");
	}

	//4. private access modifier with method

	private void message(String message) {

		System.out.println("In private method..!");
		System.out.println("Message: "+message);
	}

	//6. protected access modifier with method

	protected void addTwoNumbers(int a, int b) {

		System.out.println("In protected method..!");
		System.out.println("sum: "+(a+b));
	}

	//8. default access modifier with method

	void sum ()
	{

		System.out.println("In default method..!");
		System.out.println("sum: "+10);
	}

	public static void main(String[] args) {

		AccessModifiers obj= new AccessModifiers();
		obj.message("Hii....!");
		System.out.println("Name= "+obj.name);

		obj.addTwoNumbers(10, 20);
		System.out.println("Marks: "+obj.marks);

		/*
		 * The protected access modifier is accessible within the package and 
		 * outside the package, but through inheritance only.
		 */
		
		obj.sum();
		System.out.println("Flag : "+obj.flag);	//The default access modifier is accessible within a package only. 
	}

}


