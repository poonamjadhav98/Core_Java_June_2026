package collectionsconcept;

import java.util.LinkedHashSet;
import java.util.List;

public class ContainsAll {
	
	public static void main(String[] args) {
		
		//Expected data
		LinkedHashSet<String> list = new LinkedHashSet(); 
		list.add("India");
		list.add("US");
		list.add("SA");
		list.add("NZ");

		
		//Actual data 
		LinkedHashSet<String> list1 = new LinkedHashSet();
		list1.add("India");
		list1.add("US");
		
		//System.out.println("Check if list contains all the elements present in the list1 = "+list.containsAll(list1));
		
		LinkedHashSet<String> result = new LinkedHashSet();
		result.addAll(list);
		result.addAll(list1);
		
		result.removeAll(list1);
		
		if(result.isEmpty()) {
			System.out.println("Test case pass..!");
		}else {
			System.out.println("Test case fail..!"); 
			System.out.println("Data not available in Actual List = "+result);    //output - Test case fail..! SA
		}
		
	}

}
