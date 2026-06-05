package method;

public class ThisKeyword {
	
	String name;
	String userName;
	String myName = "Core Java";
	
	public void name(String name) {
		
		
		//name=name;				//assigns local variable to itself
		
		this.name=name;			//using 'this' keyword ------> instance variable = parameter
	}
	
	public static void main(String[] args) {
		
		ThisKeyword obj=new ThisKeyword();
		
		obj.name("Poonam");
		System.out.println("Name = "+obj.name);
	}

}
