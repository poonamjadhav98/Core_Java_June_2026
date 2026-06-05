package interfaceconcept;

public class TestMultipleInheritance implements A,B {
	
	@Override
	
	public void display() {
		
		System.out.println("In class Test");
	}
	
	public static void main(String[] args) {
		
		TestMultipleInheritance obj = new TestMultipleInheritance();
		obj.display();
	}

}
