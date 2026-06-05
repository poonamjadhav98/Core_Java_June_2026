package stringconcept;

public final class Test1 {
	
	public static void main(String[] args) {
		
		//Literal way
		String str = "Poonam";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println("Length: "+str.length());
		
		
		//Note: index starts from 0:-      0 1 2 3 4 5
		
//		String string ="Java";
//		if(string.isBlank()) {
//			System.out.println("String is Empty");
//		}
//		else {
//			System.out.println("String is not Empty");
//		}
		
		String str1 = "abcd";
		System.out.println(str1.substring(0, 2));    //ab     (1+1)
		System.out.println(str1.substring(2, 4));    //cd
		System.out.println(str1.substring(3, 4));    //d
		System.out.println(str1.substring(3));       //d
		System.out.println(str1.substring(2));       //cd
		System.out.println(str1.substring(0));       //abcd
		System.out.println(str1.substring(1));       //bcd
		
		String str2 = "Bhagwan";
		System.out.println(str2.substring(3));       //gwan
		System.out.println(str2.substring(1, 2));    //h
		System.out.println(str2.substring(2, 4));    //ag
		System.out.println(str2.substring(1, 3));    //ha
		System.out.println(str2.charAt(6));          //n
		
		
		String str3 = "Java123";
		System.out.println(str3.charAt(2));            //v
		
		System.out.println(str3.replaceAll("\\d", ""));     //Java
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
