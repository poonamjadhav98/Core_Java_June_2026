package stringconcept;

public class StringMethods {
	
	public static void main(String[] args) {
		
//		String str = "Java Automation123";
//		System.out.println(str.length());       //4
//		System.out.println(str.toUpperCase()); //JAVA Automation123
//		System.out.println(str.toLowerCase());  //java automation123
//		System.out.println(str.charAt(2));       //v
//		
//		System.out.println(str.replaceAll("\\d", ""));  //Java Automation
//		System.out.println(str.replaceAll("\\D", ""));  //123
//		
//		System.out.println(str.split(" ")[1]);            //Automation123
//		System.out.println(str.split(" ")[0]);            //Java     
//		
//		
//		System.out.println(str.concat(" Poonam"));               //Java Automation123 Poonam
//
//		System.out.println(str.replace("Java", "Selenium"));     //Selenium Automation123

		
		String str1 = "Google";
		
		System.out.println("Orininal String: "+str1);
		System.out.println("after concat str1= "+str1.concat("Microsoft"));       //GoogleMicrosoft
		
		//Strings are immutable. It means that its value cannot be changed once a string object is created.

		System.out.println("after concat str1: "+str1);        //Google
		
	}


}
