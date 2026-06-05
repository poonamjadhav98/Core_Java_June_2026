package collectionsconcept;

import java.util.HashSet;

public class HashSetConcept {
	
	public static void main(String[] args) {
		
		HashSet<Integer> list = new HashSet<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(30);         //duplicate values are not allowed
		list.add(null);         //null is allowed only once.
		list.add(null);
		System.out.println(list.size());		
		System.out.println(list);   //insertion order is not mentioned.
		
	}

}
