package collectionsconcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example2 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.addFirst(1);
		list.addLast(90);
		System.out.println(list);
		
		//Integer i = 20;
		
//		System.out.println(list.contains(20));
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
//		list1.add(40);
		
//		System.out.println(list.containsAll(list1)); //false
//		System.out.println(list.containsAll(list1)); //true
		
		//using for loop 
		
		int num = list.size();
		for(int i=0; i<num; i++) {
			
			System.out.println(list.get(i));
			
		}
		System.out.println("********************************");
		
		//using for-each loop
		
		for(int a: list) {
			System.out.println(a);
			
		}
		System.out.println("********************************");
		
		//using iterator
		
		Iterator<Integer> obj = list.iterator(); 
		
		while(obj.hasNext()) {
			
			System.out.println(obj.next());
		}
	
	}
}
