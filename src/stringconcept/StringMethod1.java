package stringconcept;

public class StringMethod1 {
	
	public static void main(String[] args) {
		
		//StringBuffer
		StringBuffer obj = new StringBuffer("abcd");
		System.out.println("Before update String: "+obj);    //abcd
		
		obj.append("efg");
		System.out.println("new String= "+obj); //abcdefg
		
		//StringBuilder
		
		StringBuilder objBuilder = new StringBuilder("xyz");
		System.out.println("Before update String: "+objBuilder);    //xyz
		objBuilder.append(" Java");
		System.out.println("After update String = "+objBuilder);     //xyz Java

	}

}
