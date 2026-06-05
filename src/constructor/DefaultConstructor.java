package constructor;

public class DefaultConstructor {

	int age;
	String myName;
	
	public void display() {
		
	System.out.println("Hello...!");
	}
	
	public static void main(String[] args) {
		
		System.out.println(new DefaultConstructor().age);	//Initializes variables with default values.(0, null, etc.)
		System.out.println(new DefaultConstructor().myName);
	}
}
