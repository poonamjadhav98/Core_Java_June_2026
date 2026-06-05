package stringconcept;

public class ReverseStringDemo {
	
	public static void main(String[] args) {
		
		StringBuilder objBuilder = new StringBuilder("xyz");
		System.out.println("Reverse String: "+objBuilder.reverse());   //zyx
		
		//how to count words in a string?
		
		String str = "java automation life up";
		String [] arr = str.split(" ");  // ["java", "automation", "life", "up"]
		System.out.println(arr.length);         //4
	}

}
