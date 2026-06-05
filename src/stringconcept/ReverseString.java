package stringconcept;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "Poonam";   //output should be reverse string = manoop
		System.out.println("Original String: "+str);
		String name = "";
		
		int count=str.length();
		for(int i=count-1; i>=0; i--) {
			name = name+str.charAt(i);
		}
		
		System.out.println("Reverse String: "+name);
	}

}
