package interfaceconcept;

public interface Browser {
	
	int age = 10;
	
	void open();      // public abstract void open();
	
	void search(String search);     
	
	// we no need to explicitly add 'abstract keyword to the interface methods
	
	//compiler will add a keyword 'abstract' by default to the interface method 
	
	//try to define non-abstract method 
	
	/**void test() {          //abstract methods do not specify a body
		
		System.out.println("In non-abstract method");
	}*/
	
	static void test2() {
		
		System.out.println("In static method");
	}

}
