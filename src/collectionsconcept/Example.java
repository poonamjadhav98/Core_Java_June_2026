package collectionsconcept;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println("Before remove List: "+list);
		//remove using index
		//list.remove(1);
		//remove using object
		//list.remove(Integer.valueOf(30)); OR
		Integer a=30;
		list.remove(a);
		
		System.out.println("After remove List=: "+list);
		
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(50);
		System.out.println("*********************************************");
		//Remove collection using removeAll()
		System.out.println("Before Remove List1: "+list1);
		list1.removeAll(list1);
		System.out.println("After remove List1 = "+list1);
		
		//if you want unique data between two lists, removeAll() will be useful.
		//only unique data will be kept in the list/collection and rest will be removed from the lists
		
		//Remove duplicate data using removeAll()
		
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(10);
		list3.add(20);
		list3.add(30);
		
		List<Integer> list4 = new ArrayList<Integer>();
		list4.add(10);
		list4.add(20);
		list4.add(30);
		
		list3.removeAll(list4);
		System.out.println("After removing duplicate data List3 = "+list3); //[20, 30]
		
	}
}
