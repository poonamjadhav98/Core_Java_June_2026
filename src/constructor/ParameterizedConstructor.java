package constructor;

public class ParameterizedConstructor {

	//	int age;
	//	String myName;

	int a=10;

	static ParameterizedConstructor classObjectTest;

	public static void message() {
		System.out.println("Hello..!");

	}

	ParameterizedConstructor(int age, String myName){

		System.out.println("Age= "+age);
		System.out.println("My name= "+myName);

	}

	public static void main(String[] args) {

		//ParameterizedConstructor obj=new ParameterizedConstructor(10, "Poonam");
		//System.out.println(obj.age+" "+obj.myName);

		new ParameterizedConstructor(20, "John").message();	//20/John/Hello..!

		int number = new ParameterizedConstructor(30, "Daisey").a; //30, Daisey
		System.out.println("Number= "+number);  //10

		classObjectTest=new ParameterizedConstructor(300, "Java");

	}

}
