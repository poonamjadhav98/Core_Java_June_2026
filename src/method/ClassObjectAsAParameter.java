package method;

public class ClassObjectAsAParameter {
	
	public void displayName(ThisKeyword obj) {
		
		String str = obj.myName;
		System.out.println("My Name = "+str);
	}
	
	public static void main(String[] args) {
		
		ClassObjectAsAParameter obj=new ClassObjectAsAParameter();
		obj.displayName(new ThisKeyword());
	}

}
