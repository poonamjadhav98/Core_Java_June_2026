package variables;

public class InstanceVariables {
	
	int myAge=20;
	String userName = "Poonam";
	boolean flag=true;
	
	
	public void test() {
		//instance area
		
		System.out.println(myAge);
		System.out.println(userName);
		System.out.println(flag);
	}
	
	public void test123() {
		//instance area
		
		System.out.println(myAge);
		System.out.println(userName);
		System.out.println(flag);
	}
	
	
	public static void main(String[] args) {
		
		//static method
		InstanceVariables obj = new InstanceVariables();
		obj.myAge=33;
		
		System.out.println(obj.myAge);
		System.out.println(obj.userName);
		System.out.println(obj.flag);
		
	}

}
