package abstraction;

public abstract class TestMain {
	
	public TestMain() {
	
		//we can declare a constructor in abstract class
	}
	
	abstract void show();

	
	public static void main(String[] args) {     //we can create main method in abstract class
		
		//TestMain obj = new TestMain(); //cannot instantiate abstract class
		
	}
}
