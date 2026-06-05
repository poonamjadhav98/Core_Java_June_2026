package collectionsconcept;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(); //without parameter constructor
		list.add(10);
		list.add(20);
		
		List<Integer> list2 = new ArrayList<>(list); //with constructor
		
		System.out.println("Added list collection in List2 Constructor: "+list2);
	}
}
