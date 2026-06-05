package collectionsconcept;

import java.util.LinkedHashSet;


public class LinkedHashSetConcept {

	public static void main(String[] args) {

		LinkedHashSet list = new LinkedHashSet();
		list.add(10);
		list.add(10.29);
		list.add("Poonam");
		list.add('c');
		list.add(10);                  //duplicates are not allowed
		list.add(null);                //null value can be added only once

		System.out.println("List data: Primitive+Non-primitive = "+list);     //insertion order is maintained
		System.out.println("*********************************************");

		LinkedHashSet<Character> list1 = new LinkedHashSet();
		list1.add('a');
		list1.add('b');
		list1.add('c');
		list1.add('a');
		list1.add('b');
		System.out.println("Check if the collection/list1 contains the specified single element = "+list1.contains('a'));
		System.out.println("Check if the list1 contains all elements present in the specified collection - list = "+list1.containsAll(list));
		System.out.println("List1 data: Character = "+list1);
		






	}

}
