package arrayconcept;

import java.util.Arrays;

public class Assignment {

	public static void main(String[] args) {

		int age[] = {2,4,3,1,5,8,7};
		int temp;
		
		for(int i=0;i<age.length;i++) {
			
		for(int j=i+1; j<age.length;j++) {
			
			if (age[i]>age[j]) {
				temp = age[i];
				age[i] = age[j];
				age[j] = temp;
			}
		}
	}
		
		// Iterating array in ascending order
		for (int i : age) {
			System.out.println(i);
		}
		
		System.out.println("Minimum value is = "+age[0]);
		System.out.println("Maximum value is = "+age[age.length-1]);
		System.out.println("2nd Highest / Maximum value = "+age[age.length-2]);
		
	
		
		/*for (int i : age) {
			System.out.println(i);
		}

		Arrays.sort(age);

		System.out.println("After sort.......................!");

		for (int i : age) {
			System.out.println(i);
		}
		
		System.out.println("Minimum value is = "+age[0]);
		System.out.println("Maximum value is = "+age[age.length-1]);
		System.out.println("2nd Highest / Maximum value = "+age[age.length-2]);
	*/
	}
}
