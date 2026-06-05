package collectionsconcept;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		//Non-generic concept (different data types can be added
		
		ArrayList list = new ArrayList();  
		list.add(10);     //insertion order is maintained
		list.add("Poonam");
		list.add('A');
		list.add(10.5);
		list.add(10);   
		list.add("Poonam"); //duplicate values are allowed
		
		System.out.println("Size of List: "+list.size());
		System.out.println(list);
		list.add(10);       //duplicates are allowed in arraylist
		list.add(null);
		System.out.println("Size of List: "+list.size());
		System.out.println(list);
		
		System.out.println("At index 3 = "+list.get(3));
		//Generic concept - Similar type of data can be added 
		
		//String str = list.get(1); //compile time error --> cannot convert from Object to String
		
		
		//cascading 
		String str = (String) list.get(1);
		System.out.println("String at 1st index = "+str);
		
		
		int a = (int) list.get(0);
		System.out.println("Integer value at index 0 = "+a);
		
		//Generic concept
		
		List<String> list1 = new ArrayList<String>(); 
		list1.add("PJ");
		list1.add("SJ");
		list1.add("RJ");
		//list1.add(50);    Not acceptable
		
		System.out.println("List1 data     = "+list1);
		String str1 = list1.get(2);
		System.out.println("String value at index 2 in list1 = "+str1);
		
		//Add 'Integer' type data in list
		
		//Generic
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(50);
		list2.add(40);
		
		System.out.println("********************************************");
		System.out.println("Printing list2 data = "+list2);
		int val = list2.get(2);
		System.out.println("value at 2nd index = "+val);
		
		System.out.println("**********************************************");
		
		List<Object> list3 = new ArrayList<Object>();
		list3.add(10);
		list3.add("Shivanya");
		System.out.println("Printing List3 data = "+list3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int a=10;
//		Integer i=a; //compiler internally convert
//		
//		Integer ab = Integer.valueOf(a);
//		char c='a';
//		Character ch = c;
//		Character.valueOf(c);
//		
//		//Auto-unboxing
//		
//		Integer obj = new Integer(10);
//		int abcd=obj;
		
		//int >>> Integer
		//char >>> Character
		//String >>> String
		//boolean >>> Boolean
		//short >>> Short
		//long >>> Long
	}

}
