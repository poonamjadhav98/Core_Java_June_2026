package arrayconcept;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		//declaration
		
		int []age = new int[5];
		System.out.println("Age length: "+age.length);     //Age length: 5
//		System.out.println(": "+age);        incorrect way to print an array output.
		
		age[0] = 10;
		age[1] = 20;
		age[2] = 30;
		age[3] = 40;
		age[4] = 50;
		
		System.out.println("Value of index 4: "+age[4]);      //50
		
		System.out.println("******************************");
		System.out.println("******************************");

		
		int lengthOfArray=age.length;
		
		//using for loop
		System.out.println("Using for loop output= ");
		
		for (int i = 0; i<lengthOfArray; i++) {
			System.out.println("Value of index "+i+" : "+age[i]);
		}
		
		System.out.println("******************************");
		
		System.out.println("Using for-each loop output = ");
		//for-each loop
		
		for (int arr : age) {
			System.out.println(" : "+arr);
		}
		
		//String array
		System.out.println("********************************");
		System.out.println("String array.....!");
		String []str = new String[3];
		
		str[0] = "Poonam";
		str[1] = "Shivanya";
		str[2] = "Pankaj";
		
		for (String s : str) {
			System.out.println("...... :: "+s);
		}
		System.out.println("********************************");
		System.out.println("********************************");
		
		System.out.println("Char array.....!");
		
		char ch[] = {'a','b','c'};
		System.out.println("Length of ch: "+ch.length);
		
		for(int i=0; i<ch.length; i++) {
			System.out.println("Value of index "+i+" = "+ch[i]);
		}
	}
}
