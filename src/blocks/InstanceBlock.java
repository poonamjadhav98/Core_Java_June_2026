package blocks;

public class InstanceBlock {

	//instance block 1
	{

		System.out.println("Instance Block");
	}


	public void message() {

		System.out.println("Hi");
	}

	public InstanceBlock(int i) {		//Parameterized Constructor

		System.out.println("In constructor "+i);
	}

	public static void main(String[] args) {

		InstanceBlock obj1 = new InstanceBlock(1);  //Instance block runs before the constructor
		obj1.message();
		InstanceBlock obj2 = new InstanceBlock(2);
		obj2.message();
		InstanceBlock obj3 = new InstanceBlock(3);
		obj3.message();
		InstanceBlock obj4 = new InstanceBlock(4);
		obj4.message();

	}

}
