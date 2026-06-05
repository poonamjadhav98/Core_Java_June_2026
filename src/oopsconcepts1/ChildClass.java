package oopsconcepts1;

public class ChildClass extends ParentClass {

	int a=20;
	int b=30;

	@Override
	public void info() {
		
	System.out.println("In child class");
	System.out.println("a= "+a);
	System.out.println("b= "+b);
	}
	
	public static void main(String[] args) {
		
		ParentClass obj = new ChildClass();
		obj.info();
	}

}
