package collectionsconcept;

import java.util.ArrayList;
import java.util.List;

public class FindingDuplicateValue {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		list.add(10);
		list.add(40);
		list.add(40);

		//2nd list to store unique data

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if(list1.contains(list.get(i))) {
				list2.add(list.get(i));
			}else {
				list1.add(list.get(i));
			}

			
		}
		System.out.println("Duplicate values/data = "+list2);
	}

}
