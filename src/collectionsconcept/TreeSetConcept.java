package collectionsconcept;

import java.util.TreeSet;

public class TreeSetConcept {

	public static void main(String[] args) {
		
		TreeSet<Integer> list = new TreeSet<>();
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(2);
//		list.add(2);             //duplicate values are not allowed
//		list.add(null);        //Null-pointer exception - null value is not allowed
		System.out.println(list);  //maintains ascending order  --> [1, 2, 3, 4]
	}
}
